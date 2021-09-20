package com.java.learn.dsalgo.slidingwindow;

public class Program2_MaximumOfSubArray {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 1, 3, 2}, k = 3; //output: 9
        int result = maxSubArray(arr,k);
        System.out.println(result);
        System.out.println(maxSubArray(new int[] { 2, 3, 4, 1, 5 },2)); //7
    }

    private static int maxSubArray(int[] arr, int k) {
        int sw=0,max=Integer.MIN_VALUE,rs=0;
        for(int ew =0;ew<arr.length;ew++){
            rs += arr[ew];
            if(ew-sw >= k-1){
                max = Math.max(max,rs);
                rs -= arr[sw];
                sw++;
            }
        }
        return max;
    }
}
