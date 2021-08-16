package com.java.learn.dsalgo.binarytree;

import static com.java.learn.dsalgo.binarytree.BinaryTree.*;

public class BinarySearchTree {
    public static void main(String[] args) {
        int[] input = new int[]{12,25,37,50,62,75,87};
        Node root = construct(input,0, input.length-1);
        display(root);
    }
    public static Node construct(int[] arr,int low,int hi){
        if(low>hi){
            return null;
        }

        int mid = (low+hi)/2;
        Node left = construct(arr,low,mid-1);
        Node right = construct(arr,mid+1,hi);

        Node node = new Node(arr[mid],left,right);
        return node;

    }
    public static void display(Node node){
        if(node == null){
            return;
        }

        String str = "";
        str += node.left == null? ".": node.left.data + " ";
        str += "<-" + node.data + "->";
        str += node.right == null? ".": node.right.data + " ";
        System.out.println(str);

        if(node.left != null)
            display(node.left);

        if(node.right != null)
             display(node.right);


    }
}
