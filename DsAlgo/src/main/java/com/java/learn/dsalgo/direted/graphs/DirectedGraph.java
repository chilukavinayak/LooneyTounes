package com.java.learn.dsalgo.direted.graphs;

import java.util.LinkedList;
import java.util.List;

public class DirectedGraph {

    public static class Node{
        int id;
        List<Integer> to;
        List<Integer> from;

        public Node(int id,List<Integer> to,List<Integer> from){
            this.id= id;
            this.to = to;
            this.from = from;
        }

        List<Integer> getOutEdges(){
            return from;
        }

        List<Integer> getInEdges(){
            return to;
        }
    }

    private List<Node> graph = new LinkedList<>();

    public List<Integer> topSort(List<Node> graph){

        int n = graph.size();
        List<Integer> ordering = new LinkedList<>();
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,graph,visited,ordering);
            }
        }
        return ordering;
    }
    public void dfs(int i,List<Node> graph,boolean[] visited,List<Integer> ordering){
        if(graph == null)
            return;

        for(int child : graph.get(i).getOutEdges()){
            if(!visited[child]){
                visited[child] = true;
                dfs(child,graph,visited,ordering);
                ordering.add(0,child);
            }
        }
    }

}
