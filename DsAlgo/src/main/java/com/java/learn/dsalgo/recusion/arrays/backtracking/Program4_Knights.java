package com.java.learn.dsalgo.recusion.arrays.backtracking;

import java.util.Scanner;

public class Program4_Knights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[n][n];
        printKnightTour(matrix,row,col, 1,new boolean[n][n]);
    }

    private static void printKnightTour(int[][] matrix, int row, int col,int count,boolean[][] visited) {
        if(row >= matrix.length || col >= matrix.length || row < 0 || col < 0 || visited[row][col] == true)
            return;

        if(count == matrix.length*matrix.length){
            matrix[row][col] = count;
            display(matrix);
            matrix[row][col] = 0;
            return;
        }
        visited[row][col] = true;
        matrix[row][col] = count;

        printKnightTour(matrix,row-2,col+1,count+1,visited);
        printKnightTour(matrix,row-1,col+2,count+1,visited);
        printKnightTour(matrix,row+1,col+2,count+1,visited);
        printKnightTour(matrix,row+2,col+1,count+1,visited);
        printKnightTour(matrix,row+2,col-1,count+1,visited);
        printKnightTour(matrix,row+1,col-2,count+1,visited);
        printKnightTour(matrix,row-1,col-2,count+1,visited);
        printKnightTour(matrix,row-2,col-1,count+1,visited);

        matrix[row][col] = 0;
        visited[row][col] = false;

    }

    private static void display(int[][] matrix) {
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
