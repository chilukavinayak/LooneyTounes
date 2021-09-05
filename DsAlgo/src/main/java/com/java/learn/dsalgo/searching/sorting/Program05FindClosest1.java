package com.java.learn.dsalgo.searching.sorting;

import java.util.*;

public class Program05FindClosest1 {


    /*find 'k' closest element to 'x' and return answer list*/
    /*elements in answer list should be in ascending order*/

    public static class Pair implements Comparable<Pair> {
        int val;
        int diff;
        Pair(){}
        Pair(int val,int diff){
            this.val = val;
            this.diff = diff;
        }

        public int compareTo(Pair o){
            if(this.diff > o.diff)
                return this.diff - o.diff;
            else
                return o.val - this.val;
        }
    }
    public static ArrayList<Integer> findClosest(int[]arr, int k, int x) {

        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(k, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            if(i <= k-1)
                pq.offer(new Pair(arr[i], Math.abs(arr[i] - k)));
            else{
                Pair p = pq.peek();
                if(p.val > arr[i]){
                    pq.poll();
                    pq.offer(new Pair(arr[i], Math.abs(arr[i] - k)));
                }

            }

        }
        for(Pair p : pq){
            result.add(p.val);
        }
        return result;
    }

    public static void main(String[]args) {

        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();
        int x = scn.nextInt();

        ArrayList<Integer>ans = findClosest(arr, k, x);

        for (int val : ans) {
            System.out.print(val + " ");
        }

    }
}