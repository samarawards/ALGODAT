package Nodes;

public class SingleNode extends Node{
    private Object data;
    private Object desc;
    private Node next;


    //constructor
    public SingleNode (Object data, Object desc){
        this.data = data;
        this.desc = desc;
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

    public Object getDesc(){
        return this.desc;
    }

    public void setDesc(Object desc){
        this.desc = desc;
    }

}
