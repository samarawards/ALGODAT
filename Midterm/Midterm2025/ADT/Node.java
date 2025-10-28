package Midterm2025.ADT;

public class Node {
    private Node next;
    private Object data;
    //======behavior=====
    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return this.next;
    }
    public Object getData(){
        return this.data;
    }

}
