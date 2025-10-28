package Midterm2025;

import java.nio.channels.Pipe.SinkChannel;

import Midterm2025.ADT.Node;
import Midterm2025.ADT.SingleLL;
import Midterm2025.Tree.Tree;

public class Main {
    public static void main(String[] args) {
        SingleLL myList = new SingleLL();
        Tree t1 = new Tree();
        t1.setHigh(30);
        Tree t2 = new Tree();
        t2.setHigh(25);
        Tree t3 = new Tree();
        t3.setHigh(50);

        myList.addTail(t1);
        myList.addTail(t2);
        myList.addTail(t3);

        Node pointer = myList.getHead();
        while (pointer!= null) {
            Tree tx = (Tree) pointer;
            System.out.println(tx.getHigh());
            pointer = pointer.getNext();
        }
    }
}
