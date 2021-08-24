package com.java.learn.dsalgo.arrays;

public class Kadane {

    public static void main(String[] args) {
        int[] arr = {2,3,-12,3,4,5,4,-24,3,4,5,-22,-6,-3,99,89,7,8,9};

        int result = largestSumofSubArray(arr);
        System.out.println(result);
    }

    private static int largestSumofSubArray(int[] arr) {

        int csum = arr[0];
        int osum = arr[0];

        for(int i=1;i<arr.length;i++){
            if(csum >= 0){
                csum += arr[i];
            }
            else{
                csum = arr[i];
            }

            if(csum > osum) {
                osum = csum;
            }

        }
        return osum;
    }

}
