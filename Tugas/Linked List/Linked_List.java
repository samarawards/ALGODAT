public class Linked_List {
    Node head;
    Node tail;

    public void addFirst (Food data){
        Node newNode = new Node(data);
        
        if (head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void addTail (Food data){
        Node newNode = new Node(data);

        if (tail == null) {  // kalau list kosong
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addAfter (Food data, Food After){
        Node newNode = new Node(data);

        //cari after
        Node temp = head;
        while (temp.data.foodName != After.foodName){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data.foodName + "("+ temp.data.total + ") -> ");
            temp = temp.next;
        }
    }
}