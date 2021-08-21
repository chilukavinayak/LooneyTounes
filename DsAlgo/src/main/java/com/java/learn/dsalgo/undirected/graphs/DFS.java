package com.java.learn.dsalgo.undirected.graphs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DFS {
    static ArrayList<List<Integer>> adjList= new ArrayList<List<Integer>>();
    static boolean[] isVisted ;


    public static void main(String[] args) {

        List<Integer> node0 = Arrays.asList(1,9);
        List<Integer> node1 = Arrays.asList(0,8);
        List<Integer> node2 = Arrays.asList(3);
        List<Integer> node3 = Arrays.asList(2,4,5,7);
        List<Integer> node4 = Arrays.asList(3);
        List<Integer> node5 = Arrays.asList(3,6);
        List<Integer> node6 = Arrays.asList(7,5);
        List<Integer> node7 = Arrays.asList(8,10,11,6,3);
        List<Integer> node8 = Arrays.asList(1,9,7);
        List<Integer> node9 = Arrays.asList(0,8);
        List<Integer> node10 = Arrays.asList(7,11);
        List<Integer> node11 = Arrays.asList(10,7);
        List<Integer> node12 = new ArrayList<>();

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

        isVisted = new boolean[adjList.size()];
        dfs(0);


    }

    public static void dfs(int at){

        if(isVisted[at])
            return;

        isVisted[at]=true;
        System.out.print(at+" ");
        List<Integer> neibours = adjList.get(at);
        for(Integer vertex : neibours){
            dfs(vertex);
        }

    }

}
