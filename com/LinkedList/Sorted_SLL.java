package LinkedList;

import Nodes.SingleNode;

public class Sorted_SLL extends Single_LL{
    public SingleNode head;
    public SingleNode tail;
    public int size;

    //set based on the higest
    public void addData(int data, Object desc){
        SingleNode node = new SingleNode(data, desc);

        if (isEmpty()){
            head = node;
            tail = node;            
        }else if ((int)node.getData() > (int)head.getData()){ //add First
            node.setNext(head);
            head = node;
        }else if ((int)node.getData() < (int)head.getData()){ //add last
            tail.setNext(node);
            node.setNext(null);
        }else {
            SingleNode check = head;
            while (check.getNext() != null && (int)((SingleNode)check.getNext()).getData() > (int)node.getData()) {
                check = (SingleNode)check.getNext();
            }
            node.setNext(check.getNext());
            check.setNext(node);
        }
        this.size++;
    }

    public void addDataByNumber (Object data, int number){

    }
    public void deleteData (Object data){
        SingleNode temp = head;
        if (temp.getData().equals(data)){ //delete head
            head = (SingleNode)temp.getNext();
            return;
        }
        while (((SingleNode)temp.getNext()).getData().equals(data)) {
            if (temp == tail){
                System.out.println("\ndata " + data + " is not found");
                return;
            }else{
                temp = (SingleNode)temp.getNext();
            }
        }
        temp.setNext(((SingleNode)temp.getNext()).getNext());
        System.out.println("\n" + data + " has been deleted");
        this.size--;
    }
    public void display(){
        SingleNode temp = head;
        for (int i=1; i<size; i++){
            System.out.println(i + ". " + temp.getDesc() + temp.getData());
            temp = (SingleNode)temp.getNext();
        }
    }
    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }else return false;
    }
}
