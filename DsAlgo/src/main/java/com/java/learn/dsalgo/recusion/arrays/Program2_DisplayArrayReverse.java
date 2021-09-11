package com.java.learn.dsalgo.recusion.arrays;

import java.util.Arrays;

public class Program2_DisplayArrayReverse {
    public static void main(String[] args) {
        int[] arry = {10,20,30,40,50};
        display_reverse(arry.length-1, arry);
    }

    public static void display_reverse(int n, int[]arry) {
        if(n < 0)
            return;

        System.out.println(arry[n]);
        display_reverse(n-1,arry);
    }
}
