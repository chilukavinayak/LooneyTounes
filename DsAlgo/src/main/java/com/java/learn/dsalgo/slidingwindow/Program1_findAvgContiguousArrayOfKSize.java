package com.java.learn.dsalgo.slidingwindow;

import java.util.Arrays;

public class Program1_findAvgContiguousArrayOfKSize {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        double[] rs = subSequenceOfKSize(arr,k);
        System.out.println(Arrays.toString(rs));
    }

    static public double[] subSequenceOfKSize(int[] arr,int k){

        double[] result = new double[arr.length-k+1];
        int sw = 0, rs = 0;
        for(int ew=0;ew<arr.length;ew++){
            rs = rs + arr[ew];
            if(sw+ew >= k-1){
                result[sw] = (double)rs/5.0;
                rs = rs - arr[sw];
                sw++;
            }
        }
        return result;
    }
}
