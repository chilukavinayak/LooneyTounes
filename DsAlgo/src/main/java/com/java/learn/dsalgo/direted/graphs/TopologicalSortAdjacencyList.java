package com.java.learn.dsalgo.direted.graphs;

import java.util.*;
import java.util.stream.Collectors;

public class TopologicalSortAdjacencyList {

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

        Integer[] dist = shortestDistance(graph);

        System.out.println(  Arrays.asList(dist));

        Integer[] dist1 = longestPath(graph);
        System.out.println( Arrays.asList(dist1));


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


    public static Integer[] shortestDistance(Map<Integer,List<Edge>> graph){
        List<Integer> topsort = topologicalSort(graph);
        int n = graph.size();
        Integer[] dist = new Integer[n];

        dist[0] = 0;

        for(int i=0;i<topsort.size();i++){
            int index = topsort.get(i);
            List<Edge> adjacentEdges =  graph.get(index);
            for(Edge edge : adjacentEdges){
                int newEdgeWeight = edge.weight + dist[index];
                if(dist[edge.to] == null)
                    dist[edge.to] = newEdgeWeight;
                else{
                    dist[edge.to] = Math.min(newEdgeWeight,dist[edge.to]);
                }
            }

        }

        return dist;
    }



    public static Integer[] longestPath(Map<Integer,List<Edge>> graph){
        List<Integer> topsort = topologicalSort(graph);
        int n = graph.size();
        Integer[] dist = new Integer[n];

        dist[0] = 0;

        for(int i=0;i<topsort.size();i++){
            int index = topsort.get(i);
            List<Edge> adjacentEdges =  graph.get(index);
            for(Edge edge : adjacentEdges){
                int newEdgeWeight = (-1*edge.weight) + dist[index];
                if(dist[edge.to] == null)
                    dist[edge.to] = newEdgeWeight;
                else{
                    dist[edge.to] = Math.min(newEdgeWeight,dist[edge.to]);
                }
            }

        }

        return dist;
    }


}
