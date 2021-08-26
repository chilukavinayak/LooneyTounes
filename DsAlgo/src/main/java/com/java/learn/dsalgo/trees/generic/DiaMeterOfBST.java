package com.java.learn.dsalgo.trees.generic;

import sun.reflect.generics.tree.Tree;

class TreeNode{
     TreeNode left;
     TreeNode right;
     int data;

    public TreeNode(TreeNode left, TreeNode right,int data){
        this.left = left;
        this.right = right;
        this.data = data;
    }

}



public class DiaMeterOfBST {




    //height in terms of edges
    public int height(TreeNode node){
        if(node == null){
            return -1;
        }

        int lh = height(node.left);
        int rh = height(node.right);

        return Math.max(lh,rh)+1;
    }

    public int diaMeter(TreeNode node){
        if(node == null){
            return 0;
        }

        int ld = diaMeter(node.left);
        int rd = diaMeter(node.right);

        int lh = height(node.left);
        int rh = height(node.right);

        return Math.max(Math.max(ld,rd),lh+rh+2);

    }
}
