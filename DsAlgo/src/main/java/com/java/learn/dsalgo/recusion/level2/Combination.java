package com.java.learn.dsalgo.recusion.level2;


import java.util.Scanner;

public class Combination{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        printCombinations(0,n,0,r,"");
    }
    static public void printCombinations(int cb,int tb,int cs, int ts,String ans){
        if(cb == tb){
            if(cs == ts){
                System.out.println(ans);
            }
            return;
        }

        printCombinations(cb+1,tb,cs+1,ts,ans+"i");
        printCombinations(cb+1,tb,cs,ts,ans+"-");

    }

}
