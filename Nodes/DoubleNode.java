package com.assignment.ADT_linked_list.Nodes;

public class DoubleNode extends Node{
    private Object data;
    private Node next;
    private Node previous;


    //constructor
    public DoubleNode (Object data){
        this.data = data;
    }
    
    public Object getData(){
        return this.data;
    }
    
    public Node getNext(){
        return this.next;
    }
    
    public void setNext(Node next){
        this.next = next;
    }

    public Node getPrevious(){
        return this.previous;
    }
    
    public void setPrevious(Node previous){
        this.previous = previous;
    }

}
