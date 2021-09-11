package com.java.learn.dsalgo.recusion.arrays;

import java.util.Scanner;

public class Program1_DisplayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arry = new int[n];
        for(int i=0;i<n;i++){
            arry[i] = sc.nextInt();
        }
        display(0,arry);

    }
    public static void display(int i,int[] arry){
        if(i >= arry.length)
            return;

        System.out.println(arry[i]);
        display(i+1,arry);
    }
}
