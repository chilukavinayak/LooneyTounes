package com.java.learn.dsalgo.trees;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {
    public static class TreeNode{
        Integer val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val,TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
    public static TreeNode construct(int[] arr, int low, int hi){
        if(low>hi){
            return null;
        }

        int mid = (low+hi)/2;
        TreeNode left = construct(arr,low,mid-1);
        TreeNode right = construct(arr,mid+1,hi);

        TreeNode node = new TreeNode(arr[mid],left,right);
        return node;

    }

    public static void main(String[] args) {

        int[] input = new int[]{12,25,37,50,62,75,87};
        TreeNode root = construct(input,0, input.length-1);
        display(root);
        ArrayList<Integer> ans = leftView(root);
        ans.forEach(s -> System.out.println(s + ", "));
    }

    public static void display(TreeNode root){
        if(root == null){
            return;
        }

        String str = "";
        str += root.left == null?".":root.left.val+" ";
        str += "<-"+root.val+"->";
        str += root.right == null?".":root.right.val+" ";
        System.out.println(str);

        if(root.left != null)
            display(root.left);
        if(root.right != null)
            display(root.right);
    }

    public static ArrayList<Integer> leftView(TreeNode root){

        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(i == 0)
                    ans.add(node.val);

                if(node.left != null)
                    queue.offer(node.left);

                if(node.right != null)
                    queue.offer(node.right);

            }
        }
        return ans;
    }
}
