package com.java.learn.dsalgo.recusion.arrays.Intro;

public class Program4_Factorial {
    public static void main(String[] args) {
        int ans = factorial(5);
        System.out.println(ans);
    }
    static public int factorial(int n){
        if(n <= 1)
            return n;
        return n * factorial(n-1);
    }
}
