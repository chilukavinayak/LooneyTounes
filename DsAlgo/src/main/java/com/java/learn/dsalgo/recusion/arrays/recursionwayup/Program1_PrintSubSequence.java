package com.java.learn.dsalgo.recusion.arrays.recursionwayup;

import java.util.Scanner;

public class Program1_PrintSubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printSS(str,"");
    }

    private static void printSS(String str, String asf) {
        if(str.isEmpty()){
            System.out.println(asf);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        printSS(ros,asf);
        printSS(ros,asf+ch);
    }
}
