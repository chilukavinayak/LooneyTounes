package com.java.learn.dsalgo.recusion.level2;

import java.util.Scanner;

public class Program2_PermutationToCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tb = sc.nextInt();
        int ts = sc.nextInt();

        printCombinations(new boolean[tb],tb,ts,-1,0);
    }

    private static void printCombinations(boolean[] boxes,int tb, int ts, int cb, int cs) {
        if(cb == tb)
            return;

        if(cs == ts){
            for(int i=0;i<boxes.length;i++){
                if(boxes[i])
                    System.out.print("i");
                else
                    System.out.print("-");
            }
            System.out.println();
        }



        for(int b = cb+1;b<tb;b++){
            boxes[b] = true;
            printCombinations(boxes,tb,ts,b,cs+1);
            boxes[b] = false;

        }
    }
}
