package com.java.learn.dsalgo.trees;

import static com.java.learn.dsalgo.trees.BinaryTree.*;

public class BinarySearchTree {
    public static void main(String[] args) {
        int[] input = new int[]{12,25,37,50,62,75,87};
        Node root = construct(input,0, input.length-1);
        display(root);
        System.out.println(max(root));
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

    public static int max(Node node){
        if(node == null){
            return -1;
        }

        if(node.right != null)
            return max(node.right);
        else
            return node.data;
    }


    public static int size(Node node) {
        if(node == null){
            return 0;
        }

        int lc = size(node.left);
        int rc = size(node.right);
        return lc+rc+1;

    }

    public static int sum(Node node) {
        if(node == null){
            return 0;
        }

        int ls = sum(node.left);
        int rs = sum(node.right);
        return ls+rs+node.data;
    }

    public static int min(Node node) {
        if(node == null){
            return -1;
        }

        if(node.right != null)
            return min(node.left);
        else
            return node.data;
    }

    public static boolean find(Node node, int data){
        if(node == null)
            return false;

        if(data < node.data){
            return find(node.left,data);
        }
        else if(data > node.data){
            return find(node.right,data);
        }
        else if(data == node.data){
            return true;
        }
        else
            return false;
    }

    public static void preOrder(Node node){
        if(node == null)
            return;

        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);

    }
    //ascending
    public static void inOrder(Node node){
        if(node == null)
            return;

        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }
    public static void inOrder_desc(Node node){
        if(node  == null)
            return;

        inOrder_desc(node.right);
        System.out.println(node.data);
        inOrder_desc(node.left);

    }

    public static void postOrder(Node node){
        if(node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }



}
