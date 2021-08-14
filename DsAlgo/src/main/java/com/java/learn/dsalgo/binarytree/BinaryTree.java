package com.java.learn.dsalgo.binarytree;

import java.util.*;

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

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{50, 25, 12, null, null, 37, 30 ,null, null, null, 75 ,62, null, 70, null, null, 87 ,null, null};
        Node root = construct(arr);
        display(root);
        int size = size(root);
        ansPrinter("size",size);
        int sum = sum(root);
        ansPrinter("sum", sum);
        int max = max(root);
        ansPrinter("max",max);
        int min = min(root);
        ansPrinter("min",min);
        int height = height(root);
        ansPrinter("height based on edges: ", height);
        int basedOnNodes = heightBasedOnNodes(root);
        ansPrinter("height based on edges: ", basedOnNodes);
        ansPrinter("preOrderTravers","");
        preOrder(root);
        ansPrinter("inOrderTravers","");
        inOrder(root);
        ansPrinter("postOrderTravers","");
        postOrder(root);
        ansPrinter("levelOrderTraversal","");
        levelOrder(root);
        ansPrinter("IterativePrePostIn","");
        iterativePrePostIn(root);
        ansPrinter("IsNodeExists",find(root,30));
        nodeToRootPath(root,30);
        ansPrinter("nodeToRootPath",nodeToRootPath);
        ansPrinter("printKdown","");
        printKDown(root,2);
        ansPrinter("printNodesKDistanceAway","");
        printNodesKDistanceAway(root,37,2);
        printPathRootToLeaveInRage(root,"",0,150,250);
    }

    private static void printPathRootToLeaveInRage(Node root, String ans, int sum, int low, int high) {
        if(root == null)
            return;

        if(root.left == null && root.right == null){
            sum += root.data;
            if(sum >= low && sum <= high){
                System.out.println(ans+" "+root.data);
            }
            return;
        }

        printPathRootToLeaveInRage(root.left,ans+root.data+" ",sum+root.data,low,high);
        printPathRootToLeaveInRage(root.right,ans+root.data+" ",sum+root.data,low,high);
    }

    public static<T> void ansPrinter(String name,T s) {
        System.out.println("------------------------------"+name+"--------------------------------------");
        System.out.println(s);
        System.out.println("-----------------------------------------------------------------------------");
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

    public static int max(Node node){
        if(node == null){
            return Integer.MIN_VALUE;
        }

        int lv = max(node.left);
        int rv = max(node.right);
        int maxOflvAndRv = Math.max(lv,rv);
        return Math.max(node.data,maxOflvAndRv);

    }

    public static int min(Node node){
        if(node == null){
            return Integer.MAX_VALUE;
        }

        int lv = min(node.left);
        int rv = min(node.right);
        int minOflvAndRv = Math.min(lv,rv);
        return Math.min(node.data,minOflvAndRv);

    }
    //edges
    public static int height(Node node){
        if(node == null){
            return -1;
        }

        int lh = height(node.left);
        int rh = height(node.right);

        return 1 + Math.max(lh,rh);
    }

    public static int heightBasedOnNodes(Node node){
        if(node == null){
            return 0;
        }

        int lh = heightBasedOnNodes(node.left);
        int rh = heightBasedOnNodes(node.right);

        return 1 + Math.max(lh,rh);
    }

    public static void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(Node node){
        if(node == null){
            return;
        }
        preOrder(node.left);
        System.out.println(node.data);
        preOrder(node.right);
    }

    public static void postOrder(Node node){
        if(node == null){
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.data);

    }

    public static void levelOrder(Node node){
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(node);
        while(!queue.isEmpty()){
            int s = queue.size();
            for(int i=1;i<=s;i++){
                Node cn = queue.poll();
                System.out.print(cn.data+" ");
                if(cn.left != null )
                    queue.offer(cn.left);
                if(cn.right != null)
                    queue.offer(cn.right);
            }
            System.out.println();
        }
    }

    public static void iterativePrePostIn(Node root){

        Stack<Pair> st = new Stack<Pair>();
        Pair rtp = new Pair(root,1);

        st.push(rtp);
        String pre = "";
        String in = "";
        String post = "";
        while(!st.isEmpty()){
            Pair top = st.peek();
            if(top.state == 1){
                if(top.node.left != null){
                    Node ln = top.node.left;
                    Pair lp = new Pair(ln,1);
                    st.push(lp);
                }
                pre += top.node.data+" ";
                top.state++;
            }
            else if(top.state == 2){
                if(top.node.right != null){
                    Node rn = top.node.right;
                    Pair rp = new Pair(rn,1);
                    st.push(rp);
                }
                in += top.node.data+" ";
                top.state++;
            }
            else{
                post += top.node.data+" ";
                st.pop();
            }

        }
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);

    }

    public static boolean find(Node root, int data){
        if(root == null)
            return false;

        if(root.data == data)
            return true;

       return find(root.left,data) || find(root.right, data);
    }

    public static ArrayList<Integer> nodeToRootPath = new ArrayList<Integer>();

    public static boolean nodeToRootPath(Node root, int data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            nodeToRootPath.add(root.data);
            return true;
        }

       boolean filst =  nodeToRootPath(root.left,data);
       if(filst){
           nodeToRootPath.add(root.data);
           return true;
       }
       boolean first =  nodeToRootPath(root.right,data);
       if(first){
           nodeToRootPath.add(root.data);
           return true;
       }
        return false;

    }

    public static ArrayList<Node> nodeToRootPath1 = new ArrayList<Node>();

    public static boolean nodeToRootPath1(Node root, int data){
        if(root == null)
            return false;

        if(root.data == data){
            nodeToRootPath1.add(root);
            return true;
        }

        boolean filst= nodeToRootPath1(root.left,data);
        if(filst){
            nodeToRootPath1.add(root);
            return true;
        }
        boolean first= nodeToRootPath1(root.right,data);
        if(first){
            nodeToRootPath1.add(root);
            return true;
        }
        return false;
    }

    public static void printKDown(Node node, int k){
        if(node == null || k < 0){
            return;
        }
        if(k == 0)
            System.out.println(node.data+" ");

        printKDown(node.left,k-1);
        printKDown(node.right,k-1);
    }

    public static void printKDown(Node node, int k,Node block){
        if(node == null || k < 0 || node == block){
            return;
        }
        if(k == 0)
            System.out.println(node.data+" ");

        printKDown(node.left,k-1, block);
        printKDown(node.right,k-1, block);
    }

    public static void printNodesKDistanceAway(Node root, int data, int k){
        nodeToRootPath1 = new ArrayList<Node>();
        nodeToRootPath1(root,data);

        for(int i=0;i<nodeToRootPath1.size();i++){
            printKDown(nodeToRootPath1.get(i),k-i, i==0?null:nodeToRootPath1.get(i-1));
        }
    }

}


