package com.java.learn.dsalgo.direted.graphs;

import java.util.*;

import static  com.java.learn.dsalgo.direted.graphs.TopologicalSortAdjacencyList.*;
public class Dijkstra {

    public static class Pair{
        Integer key;
        Integer value;
        public Pair(int key,int value){
            this.key = key;
            this.value = value;
        }
    }


    public static void main(String[] args) {

        final int N = 5;
        Map<Integer, List<Edge>> graph = new HashMap<Integer, List<Edge>>();

        for(int i=0;i<N;i++)
            graph.put(i, new ArrayList<>());

        graph.get(0).add(new Edge(0,1 ,4 ));
        graph.get(0).add(new Edge(0,2 , 1));
        graph.get(1).add(new Edge(1, 3, 1));
        graph.get(2).add(new Edge(2, 1, 2));
        graph.get(2).add(new Edge(2, 3, 5));
        graph.get(3).add(new Edge(3, 4,3 ));
        graph.get(4).add(new Edge(4, null, null));

        Integer[] dist = dijskraShortestDistance(graph,N,0);
        System.out.println(Arrays.asList(dist));
        System.out.println(findShortestPath(graph,N,0,4));


        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);

        List<List<Integer>> arr_arr = new ArrayList<>();
        arr_arr.add(arr);
        arr_arr.add(arr);
        arr_arr.add(arr);


        for(List<Integer> ar : arr_arr){
            System.out.println(ar);
        }


    }

    public static ArrayList<Integer> findShortestPath(Map<Integer, List<Edge>> graph, int n, int s, int e){
        Integer[] pre = new Integer[n];
        Integer[] dist = dijskraShortestDistance(graph,n,s,pre);

        ArrayList<Integer> path = new ArrayList<>();
        if(dist[e] == null)
            return path;
        for(Integer at = e; at != null; at = pre[at] ){
            path.add(0,at);
        }
        return path;

    }

    public static Integer[] dijskraShortestDistance(Map<Integer, List<Edge>> graph,int n, int s, Integer[] prev){

        Integer[] dist = new Integer[n];
        boolean[] visited = new boolean[n];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.value - b.value);
        pq.offer(new Pair(s,0));
        dist[s] = 0;
        while(!pq.isEmpty()){
            Pair currentNode = pq.poll();
            int currentNodeLabel = currentNode.key;

            if(dist[currentNodeLabel] < currentNode.value )
                continue;

            if(!visited[currentNodeLabel]){
                visited[currentNodeLabel] = true;
                List<Edge> neigbours = graph.get(currentNodeLabel);
                for(Edge neibour : neigbours){
                    if(neibour.to == null)
                        continue;

                    int newWeight = neibour.weight+dist[currentNodeLabel];
                    if(dist[neibour.to] == null){
                        dist[neibour.to] = newWeight;
                        pq.add(new Pair(neibour.to, newWeight));
                    }
                    else{
                        if(newWeight < dist[neibour.to]){
                            dist[neibour.to] = newWeight;
                            prev[neibour.to] = currentNodeLabel;
                        }
                    }

                }
            }
        }
        return dist;
    }


    public static Integer[] dijskraShortestDistance(Map<Integer, List<Edge>> graph,int n, int s){

        Integer[] dist = new Integer[n];
        boolean[] visited = new boolean[n];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.value - b.value);
        pq.offer(new Pair(s,0));
        dist[s] = 0;
        while(!pq.isEmpty()){
            Pair currentNode = pq.poll();
            int currentNodeLabel = currentNode.key;

            if(dist[currentNodeLabel] < currentNode.value )
                continue;

            if(!visited[currentNodeLabel]){
                visited[currentNodeLabel] = true;
                List<Edge> neigbours = graph.get(currentNodeLabel);
                for(Edge neibour : neigbours){
                    if(neibour.to == null)
                        continue;

                    int newWeight = neibour.weight+dist[currentNodeLabel];
                    if(dist[neibour.to] == null){
                        dist[neibour.to] = newWeight;
                        pq.add(new Pair(neibour.to, newWeight));
                    }
                    else{
                        int min = Math.min(newWeight,dist[neibour.to]);
                        dist[neibour.to] = min;
                        pq.offer(new Pair(neibour.to, min));
                    }

                }
            }
        }
        return dist;
    }



}
