package com.java.learn.dsalgo.recusion.arrays.arrays;

import java.util.Arrays;

public class Program6_findAllIndex {
    public static void main(String[] args) {
        int[] arr  = {3,4,5,3,2,3,1,3,4,7,3};
        int x = 3;
        int[] result = findAllIndex(arr,3,0,0);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] findAllIndex(int[] arr, int x, int idx, int asf) {

        if(idx >= arr.length){
            return new int[asf];
        }

        //incremented when matched recursion up
        if(arr[idx] == x)
           asf++;

        int[] ans = findAllIndex(arr,x, idx+1,asf);

        //decrement when matched while callback recursion
        if(arr[idx] == x) {
            ans[asf - 1] = idx;
            asf--;
        }

        return ans;

    }
}
