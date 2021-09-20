package com.java.learn.dsalgo.slidingwindow;

/*
* Given an array of positive numbers and a positive number ‘S,’
* find the length of the smallest contiguous subarray
* whose sum is greater than or equal to ‘S’.
* Return 0 if no such subarray exists.
*
* */
public class Program3_SubArrayGivenSum {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 2, 3, 2}, s=7;
        int ans = subArrayGivenSum(arr,s);
        System.out.println(ans);
    }

    private static int subArrayGivenSum(int[] arr, int s) {
        int st=0,rs=0,ssa=Integer.MAX_VALUE;
        for(int ew=0;ew<arr.length;ew++){
            rs += arr[ew];
            while(rs >= s){
                ssa = Math.min(ssa,ew-st+1);
                rs -= arr[st];
                st++;
            }

        }

        return ssa;
    }

}
