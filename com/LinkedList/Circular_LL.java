package LinkedList;
import java.util.Random;

import com.assignment.ADT_linked_list.Nodes.SingleNode;

public class Circular_LL extends Linked_List{
    private SingleNode head;
    private SingleNode tail;
    private int size;

    public void addHead(Object data){
        SingleNode node = new SingleNode(data, null);
        if (head == null){
            tail = node;
        }else{
            node.setNext(head);
            tail.setNext(node);
        }
        head = node;
        this.size++;
    }

    public void addTail(Object data){
        SingleNode node = new SingleNode(data, null);
        if (tail == null) {
            head = node;
        }
        else{
            node.setNext(head);
            tail.setNext(node);
        }
        tail = node;
        this.size++;
    }
    //create common menu
    public void addDataByName(Object data, Object after){
        SingleNode node = new SingleNode(data, null);
        SingleNode temp = findData(after);
        
        node.setNext(temp.getNext());
        temp.setNext(node);
        this.size++;
    }

    public void addDataByNumber (Object data, int number){

    }

    public SingleNode findData (Object data){
        SingleNode temp = head;
        while (temp.getData() != data){
            temp = (SingleNode)temp.getNext();
            if (temp == head) {
                return null;
            }
        }
        return temp;
    }
    public void deleteData (Object data){
        SingleNode temp = findData(data);
        if (temp == null){
             System.out.println("\nThe " + data + " is not in the list");
             return;
        }else if (temp.getData() == head.getData()) { // delete first menu so next menu will automaticaly be the first menu
            head = (SingleNode)head.getNext();
            tail.setNext(head);
        }else {
            SingleNode n = head;
            while (n.getNext() != temp){
                n = (SingleNode)n.getNext();
            }
            n.setNext(temp.getNext());

            if (temp.getData() == tail.getData()) tail = n; // set last menu so previous menu will automaticaly be the last menu
        }
        System.out.println("\n" + temp.getData() + " has been deleted");
        this.size--;
    }
    public void display(){
        SingleNode temp = head;
        System.out.print("HEAD -> ");
        do{
            System.out.print(temp.getData() + " -> ");
            temp = (SingleNode)temp.getNext();
        } while (temp != head);
        System.out.println("TAIL -> HEAD");
    }
    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }else return false; 
    }
    public String spin() {
        if (isEmpty()) {
            return null; // kalau kosong, gak bisa spin
        }

        Random rand = new Random();
        int index = rand.nextInt(size); // random index dari 0 → size-1

        SingleNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = (SingleNode) temp.getNext();
        }

        return (String) temp.getData();
    }
}
