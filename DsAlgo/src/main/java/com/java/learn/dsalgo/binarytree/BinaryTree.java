package com.java.learn.dsalgo.binarytree;

import java.util.Stack;

public class BinaryTree {
    public static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data, Node left,Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static class Pair{
        Node node;
        int state;
        public Pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }

    public static<T> void ansPrinter(String name,T s) {
        System.out.println("------------------------------"+name+"--------------------------------------");
        System.out.println(s);
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{50, 25, 12, null, null, 37, 30 ,null, null, null, 75 ,62, null, 70, null, null, 87 ,null, null};
        Node root = construct(arr);
        display(root);
        int size = size(root);
        ansPrinter("size",size);
        int sum = sum(root);
        ansPrinter("sum", sum);

    }
    public static Node construct(Integer[] arr){

        Node root = new Node(arr[0],null,null);
        Pair rtp = new Pair(root,1);
        Stack<Pair> st = new Stack<Pair>();
        st.push(rtp);

        int idx =0;
        while(!st.isEmpty()){
            Pair top= st.peek();
            if(top.state == 1){
                idx++;
                if(arr[idx] != null){
                    Node ln = new Node(arr[idx],null,null);
                    top.node.left = ln;
                    Pair lp = new Pair(ln,1);
                    st.push(lp);
                }else{
                    top.node.left = null;
                }
                top.state++;
            }
            else if(top.state == 2){
                idx++;
                if(arr[idx] != null){
                    Node rn = new Node(arr[idx],null,null);
                    top.node.right = rn;
                    Pair rp = new Pair(rn,1);
                    st.push(rp);
                }
                else{
                    top.node.right = null;
                }
                top.state++;
            }
            else{
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node root){
        if(root == null){
            return;
        }

        String str = "";
        str += root.left == null?".":root.left.data+" ";
        str += "<-"+root.data+"->";
        str += root.right == null?".":root.right.data+" ";
        System.out.println(str);

        if(root.left != null)
            display(root.left);
        if(root.right != null)
            display(root.right);
    }

    public static int size(Node root){
        if(root == null){
            return 0;
        }
        int lc = size(root.left);
        int rc = size(root.right);
        return lc+rc+1;
    }

    public static int sum(Node node){
        if(node == null){
            return 0;
        }
        int ls =   sum(node.left);
        int rs =  sum(node.right);
        int s = node.data + ls + rs;
        return s;
    }
}


