package com.java.learn.dsalgo.recusion.arrays.recursionwayup;

import java.util.Scanner;

public class Program4_MazePath {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       printMaze(1,1,n,m,"");
    }

    private static void printMaze(int r, int c, int n, int m, String asf) {
       if(r > n || c > m)
           return;

       if(r == n && c == m){
           System.out.println(asf);
           return;
       }

       printMaze(r,c+1,n,m,asf+"h");
       printMaze(r+1,c,n,m,asf+"v");

    }
}
