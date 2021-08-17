package com.java.learn.dsalgo.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectedComponentDFS {
    static ArrayList<List<Integer>> adjList= new ArrayList<List<Integer>>();
    static boolean[] isVisted ;
    static int[] component ;

    public static void main(String[] args) {

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

        isVisted = new boolean[adjList.size()];
        component = new int[adjList.size()];
        boolean isconnected = connectedComponent(15,9);
        System.out.println(isconnected); // true


        isconnected = connectedComponent(0,2);
        System.out.println(isconnected); //false

        isconnected = connectedComponent(6,2);
        System.out.println(isconnected); //false


        isconnected = connectedComponent(8,13);
        System.out.println(isconnected); //true

        isconnected = connectedComponent(12,10);
        System.out.println(isconnected); // false


    }

    public static boolean connectedComponent(int v1, int v2){

            for(int i=0;i<adjList.size();i++){
                dfs(i,i);
            }
            return component[v1] == component[v2];
    }

    public static void dfs(int at, int id){

        if(isVisted[at])
            return;


        isVisted[at]=true;
        component[at] = id;
        List<Integer> neibours = adjList.get(at);
        for(Integer vertex : neibours){
            dfs(vertex,id);
        }

    }

}
