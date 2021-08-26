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


    public class BSTPair{
        int dia;
        int ht;
        public BSTPair(int dia,int ht){
            this.dia = dia;
            this.ht = ht;
        }
        public BSTPair(){}
    }

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

    public BSTPair diaMeter_Optimal(TreeNode node){
        if(node == null){
           BSTPair base = new BSTPair();
           base.dia = 0;
           base.ht = -1;
           return base;
        }

        BSTPair ld = diaMeter_Optimal(node.left);
        BSTPair rd = diaMeter_Optimal(node.right);


        BSTPair myPair = new BSTPair();
        myPair.ht = Math.max(ld.ht,rd.ht)+1;
        myPair.dia = Math.max(Math.max(ld.dia,rd.dia), ld.ht + rd.ht + 2);

        return myPair;
    }
}
