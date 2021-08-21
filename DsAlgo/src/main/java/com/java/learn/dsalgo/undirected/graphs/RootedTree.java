package com.java.learn.dsalgo.undirected.graphs;

import java.util.*;

class TreeNode{
    int id;
    TreeNode parent;
    List<TreeNode> childs;

    public TreeNode(int id, TreeNode parent, List<TreeNode> childs) {
        this.id = id;
        this.parent = parent;
        this.childs = childs;
    }


}

public class RootedTree{

    public static List<List<Integer>> constructGraph(){

        List<List<Integer>> adjList = new ArrayList<List<Integer>>();
        List<Integer> node0 = Arrays.asList(4,8,14,13);
        List<Integer> node1 = Arrays.asList(5);
        List<Integer> node2 = Arrays.asList(15,9);
        List<Integer> node3 = Arrays.asList(9);
        List<Integer> node4 = Arrays.asList(0,8);
        List<Integer> node5 = Arrays.asList(1,16,17);
        List<Integer> node6 = Arrays.asList(7,11);
        List<Integer> node7 = Arrays.asList(8,10,11,6,3);
        List<Integer> node8 = Arrays.asList(0,4,14);
        List<Integer> node9 = Arrays.asList(15,2,3);
        List<Integer> node10 = Arrays.asList(15);
        List<Integer> node11 = Arrays.asList(6,7);
        List<Integer> node12 = new ArrayList<>();
        List<Integer> node13 = Arrays.asList(14,0);
        List<Integer> node14 = Arrays.asList(8,0,13);
        List<Integer> node15 = Arrays.asList(10,2,9);
        List<Integer> node16 = Arrays.asList(5);
        List<Integer> node17 = Arrays.asList(5);

        adjList.add(node0);
        adjList.add(node1);
        adjList.add(node2);
        adjList.add(node3);
        adjList.add(node4);
        adjList.add(node5);
        adjList.add(node6);
        adjList.add(node7);
        adjList.add(node8);
        adjList.add(node9);
        adjList.add(node10);
        adjList.add(node11);
        adjList.add(node12);
        adjList.add(node13);
        adjList.add(node14);
        adjList.add(node15);
        adjList.add(node16);
        adjList.add(node17);
        return adjList;
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = constructGraph();
        TreeNode root = rootTree(graph);

    }
    //graph is adj list
    public static TreeNode rootTree(List<List<Integer>> graph){
        TreeNode root = new TreeNode(0,null,new ArrayList<>());
        return buildTree(graph,root,null);
    }

    private static TreeNode buildTree(List<List<Integer>> graph, TreeNode node, TreeNode parent) {

        for(Integer childId : graph.get(node.id)){
            if(parent != null && childId == parent.id) {
                TreeNode child = new TreeNode(childId, node, new ArrayList<>());
                node.childs.add(child);
                buildTree(graph,child,node);
            }
        }
        return node;
    }

    private List<Integer> findCenter(List<List<Integer>> g){
        int n = g.size();
        int[] degree = new int[n]; // degree of every vertex of given graph
        ArrayList<Integer> leaves  = new ArrayList<>();
        for(int i=0;i<n;i++){
            degree[i] = g.get(i).size();
            //degree of current vertex is 1 or 0 (single node) then add it leave array and set degree as 0 (peeling onion)
            if(degree[i] == 0 || degree[i] == 1){
                leaves.add(i);
                degree[i] = 0;
            }
        }

        // processed firs outermost layer of onion
        int count = leaves.size();
        while(count < n){
            ArrayList<Integer> innerLayer  = new ArrayList<>();
            for(int leaf : leaves){
                for(int neighbour : g.get(leaf)){
                    degree[neighbour] = degree[neighbour] - 1;
                    if(degree[neighbour] == 1){
                        innerLayer.add(neighbour);
                        degree[neighbour] = 0;
                    }
                }
                degree[leaf] = 0;
                count += innerLayer.size();
                leaves = innerLayer;
            }
        }

        return leaves;
    }

    public boolean isomorphicTree(List<List<Integer>> g1, List<List<Integer>> g2){
        if(g1 == null && g2 == null || g1.size() != g2.size())
            return true;

        List<Integer> centerG1 = findCenter(g1);
        TreeNode rootG1 = new TreeNode(centerG1.get(0),null, new ArrayList<TreeNode>());
        TreeNode rootedTreeG1 = buildTree(g1,rootG1, null );
        String encodeStringG1 = encode(rootedTreeG1);

        List<Integer> centerG2 = findCenter(g2);
        for(int center : centerG2){
            TreeNode rootG2 = new TreeNode(center,null, new ArrayList<TreeNode>());
            TreeNode rootedTreeG2 = buildTree(g1,rootG2, null );
            String encodeStringG2 = encode(rootedTreeG2);
            if(encodeStringG1.equals(encodeStringG2)){
                return true;
            }
        }

        return false;
    }

    private String encode(TreeNode node) {
        if(node == null)
            return "";

        List<String> labels = new LinkedList<>();
        for(TreeNode child: node.childs){
            labels.add(encode(child));
        }

        Collections.sort(labels);
        StringBuilder sb = new StringBuilder();
        for(String label : labels){
            sb.append(label);
        }

        return "(" + sb.toString() + ")";

    }


}