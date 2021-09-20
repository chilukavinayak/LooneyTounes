package com.java.learn.dsalgo.recusion.level2;

import java.util.Scanner;

public class Program3_PrintPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tb = sc.nextInt();
        int ts = sc.nextInt();

        printPermutation(tb,ts,0,0,new int[tb]);
    }

    private static void printPermutation(int tb, int ts, int cb, int ssf, int[] boxes) {
       if(cb == ssf) {
           if (ssf == ts) {
               for (int i = 0; i < boxes.length; i++) {
                   System.out.print(boxes[i]);
               }
               System.out.println();
           }
       }

        for(int i=0;i<tb;i++){
            if(boxes[i] == 0){
                boxes[i] = 1;
                printPermutation(tb,ts,cb+1,ssf+1,boxes);
                boxes[i] = 0;
            }
        }
    }
}
