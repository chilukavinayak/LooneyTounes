package com.java.learn.dsalgo.recusion;

public class Program7_ZigZag {
    public static void main(String[] args) {
        Print_Zig_Zag(3);
    }
    public static void Print_Zig_Zag(int n){
        if(n == 0)
            return;

        System.out.println("pre " + n);
        Print_Zig_Zag(n-1);
        System.out.println("in "+ n);
        Print_Zig_Zag(n-1);
        System.out.println("post "+n);
    }
}
