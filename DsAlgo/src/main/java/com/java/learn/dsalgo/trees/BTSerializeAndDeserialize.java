package com.java.learn.dsalgo.trees;

import sun.reflect.generics.tree.Tree;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int data;
}

public class BTSerializeAndDeserialize {

    public String serialize(TreeNode node){
        StringBuilder sb = new StringBuilder();
         serialize(node,sb);
        return sb.toString();
    }

    private void serialize(TreeNode node, StringBuilder sb) {
        if(node == null){
            sb.append("null,");
            return;
        }

        sb.append(node.data+",");

        serialize(node.left,sb);
        serialize(node.right,sb);
    }

    private TreeNode deSerialize(String str){
        String[] strlist = str.split(",");
        return deSerialize(strlist);
    }

    private static int idx = 0;

    private TreeNode deSerialize(String[] strlist) {
        if(idx > strlist.length || strlist[0].equals("null")){
            idx++;
            return null;
        }

        TreeNode node = new TreeNode();
        node.data = Integer.parseInt(strlist[idx]);
        node.left = deSerialize(strlist);
        node.right = deSerialize(strlist);
        return node;
    }
}
