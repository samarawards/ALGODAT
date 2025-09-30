package LinkedList;

import Nodes.DoubleNode;

public class Double_LL {
    private DoubleNode head;
    private int size;

    public Double_LL (){
        this.head = null;
        this.size = 0;
    }

    private DoubleNode getLast(){
        DoubleNode last = this.head;
        while (last.getNext() != null){
            last = (DoubleNode)last.getNext();
        }
        return last;
    }

    public void addHead(Object data){
        DoubleNode node = new DoubleNode(data);
        if (!isEmpty()){
            node.setNext(head);
            node.setPrevious(null);
        }
        head = node;
        this.size++;
    }

    public void addLast(Object data){
        DoubleNode node = new DoubleNode(data);
        DoubleNode last = getLast();

        last.setNext(node);
        node.setPrevious(last);
        node.setNext(null);
        this.size++;
    }

    public void addDataByNumber (Object data, int number){
       
    }

    public DoubleNode findData (Object data){
        DoubleNode temp = head;
        while (!(temp.getData().equals(data))) {
            temp = (DoubleNode)temp.getNext();            
        }
        return temp;
    }

    public void addDataByName (Object data, Object after){
        DoubleNode node = new DoubleNode(data);

        // search the location of "after"
        DoubleNode temp = findData(after);

        if (temp.getNext() == null) {
            this.addLast(data);
            return;              
        }else{
            node.setNext(temp.getNext());
            temp.setNext(node);
            ((DoubleNode)((DoubleNode)temp.getNext()).getNext()).setPrevious(node);
            node.setPrevious(temp);
            this.size++;
        }
    }
    public void deleteData (Object data){
        DoubleNode temp = head;

        //search the place of the map that wanna be deleted
        while (!(temp.getData().equals(data))){
            if (temp.getNext() == null) {
                System.out.println("\nThe data " + data + " does not exist");
                return;
            }
            temp = (DoubleNode)temp.getNext();
        }

        if (temp.getPrevious().equals(null)) { // delete start point so next map will automaticaly be the start point
            this.head = (DoubleNode)head.getNext();
            head.setPrevious(null); 
        }else if (temp.getNext().equals(null)) {  // delete finish point so previous map will automaticaly be the finish point
            ((DoubleNode)temp.getPrevious()).setNext(null);
        }else {
            ((DoubleNode)temp.getPrevious()).setNext(temp.getNext());
            ((DoubleNode)temp.getNext()).setPrevious(temp.getPrevious());
        }
        System.out.println("\n" + temp.getData() + " has been deleted");
        this.size--;
    }
    public void display(){
        DoubleNode temp = head;
        System.out.print("START -> ");
        while (temp != null){
            System.out.print(temp.getData() + " -> ");
            temp = (DoubleNode)temp.getNext();
        }
        System.out.println("FINISH");
    }
    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }else{
            return false;
        }
    }
}
