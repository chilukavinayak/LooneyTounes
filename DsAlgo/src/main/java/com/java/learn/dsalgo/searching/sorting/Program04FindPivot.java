package com.java.learn.dsalgo.searching.sorting;

import java.util.Scanner;

public class Program04FindPivot {

    public static int pivot_index(int[]arr) {

        int rsum = 0;
        for(int i=0;i<arr.length;i++){
            rsum += arr[i];
        }

        int lsum = 0;
        int i = 0;
        while(i < arr.length){
            rsum -= arr[i];

            if(rsum == lsum)
                return i;

            lsum += arr[i];

            i++;
        }

        return -1;
    }

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];

        for(int i=0; i < arr.length;i++) {
            arr[i] = scn.nextInt();
        }

        int pi = pivot_index(arr);
        System.out.println(pi);
    }
}