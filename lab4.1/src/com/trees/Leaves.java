package com.trees;

public class Leaves {
    private int leavesCount;
    private String color;
    public Leaves(String color, int leavesCount){
        this.leavesCount = leavesCount;
        this.color = color;
    }

    public Leaves() {

    }

    public int getLeavesCount() {
        return leavesCount;
    }
    public String getColor(){
        return color;
    }
    public void setLeavesCount(int leavesCount){
        this.leavesCount = leavesCount;
    }
    public void setColor(String color){
        this.color = color;
    }
}
