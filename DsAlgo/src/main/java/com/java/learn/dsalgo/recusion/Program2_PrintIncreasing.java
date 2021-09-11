package com.java.learn.dsalgo.recusion;

public class Program2_PrintIncreasing {
    public static void main(String[] args) {
        printIncreasing(10);
    }
    static public void printIncreasing(int n){
        if(n == 0)
            return;
        printIncreasing(n-1);
        System.out.println(n);
    }
}
