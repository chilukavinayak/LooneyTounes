package com.java.learn.dsalgo.recusion;

public class Program3_PrintIncreasingAndDecreasing {
    public static void main(String[] args) {
        printIncreasingAndDecreasing(5);
    }
    static public void printIncreasingAndDecreasing(int n){
        if(n == 0)
            return;

        System.out.println(n);
        printIncreasingAndDecreasing(n-1);
        System.out.println(n);
    }
}
