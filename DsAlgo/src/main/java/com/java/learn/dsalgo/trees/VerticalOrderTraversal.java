package com.java.learn.dsalgo.trees;

import java.util.*;

public class VerticalOrderTraversal {

    class Pair{
        TreeNode node;
        int vh;
        public Pair(TreeNode node,int vh){
            this.node = node;
            this.vh = vh;
        }
    }
    public List<List<Integer>> verticalOrderTraversal(TreeNode node){

        List<List<Integer>> ans = new ArrayList<>();

        Queue<Pair> queue = new LinkedList<>();

        int minhl = 0;
        int maxhl = 0;

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        queue.offer(new Pair(node,0));

        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-- > 0){
                Pair rp = queue.poll();


                map.putIfAbsent(rp.vh, new ArrayList<>());
                map.get(rp.vh).add(rp.node.data);

                minhl = Math.min(minhl, rp.vh);
                maxhl = Math.max(maxhl, rp.vh);


                if(rp.node.left != null)
                    queue.offer(new Pair(rp.node.left, rp.vh-1));
                if(rp.node.right != null)
                    queue.offer(new Pair(rp.node.right, rp.vh+1));

            }

        }
        for(int i=minhl;i<=maxhl;i++)
            ans.add(map.get(i));

        return ans;
    }
}
