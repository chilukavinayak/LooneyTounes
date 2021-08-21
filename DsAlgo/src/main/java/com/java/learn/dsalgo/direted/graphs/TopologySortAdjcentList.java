package com.java.learn.dsalgo.direted.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopologySortAdjcentList {

    public static class Edge{
        int from;
        int to;
        int id;
        int weight;

        public Edge(int from,int to,int weight){
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

    }

    public static void main(String[] args) {

        final int N = 7;
        Map<Integer, List<Edge>>  graph = new HashMap<Integer, List<Edge>>();

        for(int i=0;i<N;i++)
            graph.put(i, new ArrayList<>());


        graph.get(0).add(new Edge(0, 1, 3));
        graph.get(0).add(new Edge(0, 2, 2));
        graph.get(0).add(new Edge(0, 5, 3));
        graph.get(1).add(new Edge(1, 3, 1));
        graph.get(1).add(new Edge(1, 2, 6));
        graph.get(2).add(new Edge(2, 3, 1));
        graph.get(2).add(new Edge(2, 4, 10));
        graph.get(3).add(new Edge(3, 4, 5));
        graph.get(5).add(new Edge(5, 4, 7));

        List<Integer> ordering = topologicalSort(graph);
        System.out.println(ordering);


    }

    private static List<Integer> topologicalSort(Map<Integer, List<Edge>> graph) {

        int n = graph.size();
        boolean[] visited = new boolean[n];
        ArrayList<Integer> ordering = new ArrayList<>();
        for(int at=0;at<n;at++){
            dfs(at,graph,visited,ordering);
        }
        return ordering;
    }

    private static void dfs(int at, Map<Integer, List<Edge>> graph, boolean[] visited, ArrayList<Integer> ordering) {

        if(visited[at])
            return;

        visited[at] = true;

        for(Edge edge : graph.get(at)){
            if(!visited[edge.to]){
                dfs(edge.to, graph,visited,ordering);
            }
        }
        ordering.add(0,at); //adding at end;

    }


}
