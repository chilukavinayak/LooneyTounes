package com.java.learn.dsalgo.recusion.arrays.backtracking;

import java.util.Scanner;

public class Program1_FloodFills {
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        visited = new boolean[n][m];
        printAllPaths(0,0,matrix,"");
    }

    private static void printAllPaths(int i,int j,int[][] matrix, String asf) {
        if(i >= matrix.length || i < 0 || j >= matrix[0].length || j < 0 || matrix[i][j] == 1 || visited[i][j] == true)
            return;

        if(i == matrix.length-1 && j == matrix[0].length-1){
            System.out.println(asf);
            return;
        }


            visited[i][j] = true;
            printAllPaths(i-1,j,matrix,asf+"t");//t
            printAllPaths(i,j-1,matrix,asf+"l"); //l
            printAllPaths(i+1,j,matrix,asf+"d"); //d
            printAllPaths(i,j+1,matrix,asf+"r"); //r
            visited[i][j] = false;


    }

}
