package com.java.learn.dsalgo.recusion.arrays.recursionwayup;

import java.util.Scanner;

public class Program5_MazePathWithVariableJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePathWithVariableJump(1,1,n,m,"");
    }

    private static void printMazePathWithVariableJump(int r, int c, int n, int m, String asf) {

        if(r > n || c > m)
            return;

        if( r==n || c == m){
            System.out.println(asf);
            return;
        }

        for(int j = 1;j<=m-c;j++)
            printMazePathWithVariableJump(r,c+j,n,m,asf+"h"+j);

        for(int i=1;i<=n-r;i++)
            printMazePathWithVariableJump(r+i,c,n,m,asf+"v"+i);

        for(int ij=1;ij<=n-r && ij<=m-c; ij++)
            printMazePathWithVariableJump(r+ij,c+ij,n,m,asf+"d"+ij);


    }
}
