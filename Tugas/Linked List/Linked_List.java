public class Linked_List {
    Node head;
    Node tail;
    Node temp;

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

    public void addLast (Food data){
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
        temp = head;
        while (temp.data.foodName != After.foodName){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void delete (String data){
        temp = head;

        //deleteHead
        if (temp.data.foodName.equals(data)){
            head = temp.next; 
            System.out.println(data + " has been deleted from list");            
            return;
        }

        //cari letak yang mau dihapus
        while (temp.next != null) {
            if (temp.next.data.foodName.equals(data)){
                //deleteTail
                if (temp.next == tail){
                    tail = temp;
                    tail.next = null;
                }else{
                    temp.next = temp.next.next;
                }
                System.out.println(data + " has been deleted from list");
                return;
            }
            temp = temp.next;
        }
        System.out.println(data + " is nothing in the list");
    }

    public boolean findData(String name){
        temp = head;
        while (temp != null){
            if (temp.data.foodName.equals(name)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void display(){
        Node temp = head;
        System.out.print("Start -> ");
        while (temp != null) {
            System.out.print(temp.data.foodName + "("+ temp.data.total + ") -> ");
            temp = temp.next;
        }System.out.println("Finish");
    }
}