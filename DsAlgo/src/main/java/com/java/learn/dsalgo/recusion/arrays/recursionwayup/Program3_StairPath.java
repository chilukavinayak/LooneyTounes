package com.java.learn.dsalgo.recusion.arrays.recursionwayup;

import java.util.Scanner;

public class Program3_StairPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStairPath(n, "");
    }

    private static void printStairPath(int n, String asf) {
        if(n < 0){
            return;
        }
        if(n == 0){
            System.out.println(asf);
            return;
        }

        printStairPath(n-1,asf+"1");
        printStairPath(n-2,asf+"2");
        printStairPath(n-3,asf+"3");


    }
}
