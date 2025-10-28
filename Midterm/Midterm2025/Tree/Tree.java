package Midterm2025.Tree;

import Midterm2025.ADT.Node;

public class Tree extends Node{
    private String id = "";
    private int high = 0;
    private String type = "";

    public void setHigh(int high){
        this.high = high;
    }
    public int getHigh(){
        return this.high;
    }
}
