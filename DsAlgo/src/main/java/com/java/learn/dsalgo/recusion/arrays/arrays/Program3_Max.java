package com.java.learn.dsalgo.recusion.arrays.arrays;

public class Program3_Max {
    public static void main(String[] args) {


        int [] arry = {33,21,22,14,16,83,80,14};
        int max = max(arry,0);
        System.out.println(max);
    }

    private static int max(int[] arry, int i) {
        if(i >= arry.length)
            return -1;

        int cmax = max(arry, i+1);

        int max = Math.max(arry[i],cmax);

        return max;
    }
}
