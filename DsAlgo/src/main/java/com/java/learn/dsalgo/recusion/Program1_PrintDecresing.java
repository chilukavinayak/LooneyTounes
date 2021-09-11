package com.java.learn.dsalgo.recusion;

import java.util.Scanner;

public class Program1_PrintDecresing {
    public static void main(String[] args) {
        PrintDecreasing(15);
    }

    private static void PrintDecreasing(int n) {
        if(n == 0)
            return;

        System.out.println(n);
        PrintDecreasing(n-1);
    }

}
