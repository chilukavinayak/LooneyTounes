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

    //preOrder-Iterative-Construct
    public Node constructTree(int[] a){

        Node rn = new Node(a[0]);
        Pair rp = new Pair(rn,1);
        Stack<Pair> s = new Stack<Pair>();
        s.push(rp);
        int idx = 0;
        while(!s.isEmpty()){
            Pair p = s.peek();
            if(p.state == 1){
                idx++;
                Node ln = new Node(a[idx]);
                p.node.left = ln;
                p.state++;
                Pair lp = new Pair(ln,1);
                s.push(lp);
            }
            else if(p.state == 2){
                idx++;
                Node n = new Node(a[idx]);
                p.node.right = n;
                p.state++;
                Pair rtp = new Pair(rn,1);
                s.push(rtp);
            }
            else{
                s.pop();
            }


        }
        return rn;
    }
}
