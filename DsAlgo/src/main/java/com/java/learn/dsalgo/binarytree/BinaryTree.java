package com.java.learn.dsalgo.binarytree;

import java.util.Stack;

class Pair{
    public Node node;
    public int state;

    public Pair(Node node, int state) {
        this.node = node;
        this.state = state;
    }
}
class Node{
    public int data;
    public Node left;
    public Node right;

    public Node(int data){
        this.data = data;
    }

    public Node(int data,Node left,Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTree {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Integer[] arr = new Integer[]{50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root = bt.constructTree(arr);
        bt.display(root);
    }

    //preOrder-Iterative-Construct
    public Node constructTree(Integer[] a){

        Node rn = new Node(a[0]);
        Pair rp = new Pair(rn,1);
        Stack<Pair> s = new Stack<Pair>();
        s.push(rp);
        int idx = 0;
        while(s.size()>0){
            Pair p = s.peek();
            if(p.state == 1){
                idx++;

                if(a[idx] != null){
                    Node ln = new Node(a[idx]);
                    p.node.left = ln;
                    Pair lp = new Pair(ln,1);
                    s.push(lp);
                }
                p.state++;
            }
            else if(p.state == 2){
                idx++;
                if(a[idx] != null){
                    Node n = new Node(a[idx]);
                    p.node.right = n;
                    Pair rtp = new Pair(rn,1);
                    s.push(rtp);
                }
                p.state++;
            }
            else{
                s.pop();
            }


        }
        return rn;
    }

    public void display(Node root){
        if(root == null){
            return;
        }

        String str = "";
        str += root.left == null?".":root.left.data;
        str += "<-" + root.data + "->";
        str += root.right == null?".":root.right.data;
        System.out.println(str);

        if(root.left != null)
            display(root.left);
        if(root.right != null)
            display(root.right);
    }
}
