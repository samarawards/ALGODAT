package LinkedList;

import Nodes.SingleNode;

public class Single_LL extends Linked_List {
    private SingleNode head;
    private SingleNode tail;
    private int size;

    //constructor
    public Single_LL (){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void getHead(){
        System.out.println("\nThe last data is " + this.head.getData());
    }
    public void getTail(){
        System.out.println("The first data is " + this.tail.getData());
    }
    
    public void addDataByNumber (Object data, int number){
        SingleNode node = new SingleNode(data, null);
        SingleNode temp = head;

        if (number > size){
            addTail(data);
            return;
        }

        for (int i=1; i<number-1; i++){
            temp = (SingleNode)temp.getNext(); //casting
        }
        node.setNext(temp.getNext());
        temp.setNext(node);
        this.size++;
    }

    public void addHead (Object data){
        SingleNode node = new SingleNode(data, null);
        
        if (head == null){
            this.head = node;
            this.tail = node;
        }else{
            node.setNext(head);
            this.head = node;
        }
        this.size++;
    }

    public void addTail (Object data){
        SingleNode node = new SingleNode(data, null);

        if (this.head == null) {  // kalau list kosong
            this.head = node;
            this.tail = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }
        this.size++;
    }
    
    public void deleteData (Object data){
        if (head == null) { // kalau list kosong
            System.out.println("\nList is empty, nothing to delete.");
            return;
        }
        SingleNode temp = head;
        if (temp.getData() == data) { // Kasus 1: data ada di head
            head = (SingleNode) temp.getNext();
            if (head == null) { // kalau cuma 1 node
                tail = null;
            }
            size--;
            System.out.println("\n" + data + " has been deleted");
            return;
        }

        while (temp.getNext() != null && !(((SingleNode) temp.getNext()).getData().equals(data))) {
            temp = (SingleNode) temp.getNext();
        }

        if (temp.getNext() == null) { // data ga ketemu
            System.out.println("\nThere's no item named " + data);
            return;
        }

        SingleNode target = (SingleNode) temp.getNext(); // Kasus 3: hapus node di tengah atau tail
        temp.setNext(target.getNext());

        if (target == tail) { // kalau yang dihapus tail
            tail = temp;
        }

        size--;
        System.out.println("\n" + data + " has been deleted");
    }
    public void display(){
        if (isEmpty()){
            System.out.println("!!!NO ITEM!!!");
            return;
        }else{
            SingleNode node = head;
            for (int i = 1; i<=size; i++){
                System.out.println(i + ". " + node.getData());
                node = (SingleNode)node.getNext();
            }
            // System.out.print("FIRST -> ");
            // while (node != null) {
                //     System.out.print(node.getData() + " -> ");
                //     node = (SingleNode)node.getNext();
                // }
                // System.out.println("LAST");
        }
    }

    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }else return false;
    }



}
