package com.java.learn.dsalgo.trees.generic;

import java.util.List;

public class tree {
    public class Node{
        int data;
        List<Node> childs;

    }

    public int sumLeaf(Node node){
        if(node == null)
            return 0;

        if(isLeaf(node))
            return node.data;
        int sum = 0;

        for(Node child : node.childs){
            int leafValue = sumLeaf(child);
            sum += leafValue;
        }
        return sum;
    }

    public boolean isLeaf(Node node){
        return node.childs.size() == 0;
    }

}
