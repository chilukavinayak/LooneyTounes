package com.java.learn.dsalgo.recusion.arrays.arrays;

public class Program4_FirstIndex {
    public static void main(String[] args) {
        int [] arry = {33,21,22,14,22,83,22,14};
        int x = 83;
        int fi = firstIndex(arry,x,0);
        if(fi == -1)
            System.out.println("Element not found");
        else
            System.out.println(fi);
    }

    private static int firstIndex(int[] arry, int x,int idx) {
        if(idx >= arry.length)
            return -1;

        if(arry[idx] == x)
            return idx;

        int ci = firstIndex(arry,x,idx+1);
        if(arry[idx] == x)
            return idx;
        else
            return ci;
    }

}
