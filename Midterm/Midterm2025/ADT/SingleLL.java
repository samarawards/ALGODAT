package Midterm2025.ADT;

public class SingleLL {
    private Node head;
    private Node tail;
    private Node temp;

    public Node getHead(){
        return head;
    }

    public void addTail (Node newNode){

        if (head == null){
            head = newNode;
        }else{
            tail.setNext(newNode);
        }
        tail = newNode;
    }

}
