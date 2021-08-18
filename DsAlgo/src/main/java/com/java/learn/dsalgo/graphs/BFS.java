package com.java.learn.dsalgo.graphs;

import java.util.*;

public class BFS {
    static ArrayList<List<Integer>> adjList= new ArrayList<List<Integer>>();


    public static void main(String[] args) {

        List<Integer> node0 = Arrays.asList(11,7,9);
        List<Integer> node1 = Arrays.asList(10,8);
        List<Integer> node2 = Arrays.asList(12,3);
        List<Integer> node3 = Arrays.asList(2,4,7);
        List<Integer> node4 = Arrays.asList(3);
        List<Integer> node5 = Arrays.asList(6);
        List<Integer> node6 = Arrays.asList(7,5);
        List<Integer> node7 = Arrays.asList(0,11,6,3);
        List<Integer> node8 = Arrays.asList(1,9,12);
        List<Integer> node9 = Arrays.asList(0,10,8);
        List<Integer> node10 = Arrays.asList(1,9);
        List<Integer> node11 = Arrays.asList(0,7);
        List<Integer> node12 = Arrays.asList(8,2);

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

      //  bfs(0);
        Integer[] pre = new Integer[adjList.size()];
        List<Integer> path = getPath(0,2,pre);
        System.out.println(path);

    }

    public static List<Integer> getPath(int s,int e,Integer[] prev){

        boolean[] isvisited = new boolean[adjList.size()];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        isvisited[s] = true;
        while(!queue.isEmpty()){
            Integer cn = queue.poll();
            for(Integer next : adjList.get(cn)){
                if(!isvisited[next]){
                    queue.offer(next);
                    isvisited[next] = true;
                    prev[next] = cn;
                }
            }
        }

        return constructPath(s,e,prev);
    }

    public static List<Integer> constructPath(int s,int e, Integer[] prev){
        ArrayList<Integer> path = new ArrayList<>();
        for(Integer at = e; at != null ; at = prev[at]){
            path.add(at);
        }

        Collections.reverse(path);

        if(path.get(0) == s)
            return path;
        else
            return new ArrayList<>();
    }

    public static void bfs(int at){

        boolean[] visited = new boolean[adjList.size()];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(at);
        visited[at] = true;
        System.out.print(at+" ");
        while(!queue.isEmpty()){
            int cv = queue.poll();
            List<Integer> neibours = adjList.get(cv);
            for(Integer bv : neibours){
                if(!visited[bv]){
                    System.out.print(bv+" ");
                    visited[bv] = true;
                    queue.offer(bv);
                }
            }
        }
    }

}
