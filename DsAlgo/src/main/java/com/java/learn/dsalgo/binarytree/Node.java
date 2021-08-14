package com.java.learn.dsalgo.binarytree;

public class Node {

    private int data;
    private Node left;
    private Node right;

    public Node(int data,Node left,Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node left(){
        return left;
    }

    public Node right(){
        return right;
    }

    public int data(){
        return data;
    }
}
