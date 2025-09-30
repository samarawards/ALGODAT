package LinkedList;

import Nodes.SingleNode;

public class Ordered_SLL extends Linked_List{
    private SingleNode head;
    private SingleNode tail;
    private int size;

    public void addData(Object data, Object difficulty) {
        SingleNode node = new SingleNode(data, difficulty);

        if (head == null) {
            head = tail = node;
        } else if (difficulty.equals("Hard") || difficulty.equals("hard")) {
            node.setNext(head);
            head = node;
        } else if (difficulty.equals("Easy") || difficulty.equals("easy")) {
            tail.setNext(node);
            tail = node;
        } else {
            // Medium masuk di tengah (setelah semua Hard, sebelum Easy)
            SingleNode temp = head;
            while (temp.getNext() != null && !((String)((SingleNode) temp.getNext()).getDesc() == "Easy")) {
                temp = (SingleNode) temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
            if (node.getNext() == null) {
                tail = node;
            }
        }
        this.size++;
    }

    public void addDataByNumber (Object data, int number){

    }
    public void deleteData (Object data){
        SingleNode temp = head;
        boolean isFound = false;
        
        if (temp.getData() == data){
            head = (SingleNode)head.getNext();
            isFound = true;
            this.size--;
        }else{
            for (int i = 0; i<size; i++){
                if (((SingleNode)temp.getNext()).getData() == data){
                    temp.setNext(((SingleNode)temp.getNext()).getNext());
                    isFound = true;
                    this.size--;
                    continue; //karena siapa tau datanya lebih dari satu
                }
                temp = (SingleNode)temp.getNext();
            }
        }
        if (!isFound){
            System.err.println("\n" + data + " is not found");
        }else{
            System.out.println("\nAll " + data + " has been deleted");
        }
    }
    public void display(){
        SingleNode temp = head;
        for (int i = 1; i <= size; i++){
            System.err.println(i + ". " + temp.getData() + " -> " + temp.getDesc());
            temp = (SingleNode)temp.getNext();
        }
    }
    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }else return false;
    }

}
