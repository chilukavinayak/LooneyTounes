package com.java.learn.dsalgo.recusion.arrays.backtracking;

public class Program2_TargetSumsets {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 60;
        printTargetSubSet(arr,target,0,0,"");
    }

    private static void printTargetSubSet(int[] arr, int tar, int idx, int asf, String set) {
        if(idx == arr.length){
            if(tar == asf){
                System.out.println(set+"." );
            }
            return;
        }


        printTargetSubSet(arr,tar,idx+1,asf+arr[idx],set+arr[idx]+", ");
        printTargetSubSet(arr,tar,idx+1,asf,set);

    }

}
