package com.java.learn.dsalgo.recusion.arrays.backtracking;

import java.util.Scanner;

public class Program3_NQueens {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        printNQueens(chess,0,"");
    }

    private static void printNQueens(int[][] chess, int row, String asf) {
        if(row == chess.length){
            System.out.println(asf+". ");
            return;
        }

        for(int col=0;col < chess.length;col++){
            if(isValid(chess,row,col) == true)
            {
                chess[row][col] = 1;
                printNQueens(chess, row + 1, asf + row + "-" + col + ", ");
                chess[row][col] = 0;
            }
        }
    }

    private static boolean isValid(int[][] chess, int row, int col) {

        for(int i = row-1;i>=0;i--){
            if(chess[i][col] == 1)
                return false;
        }

        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i=row-1,j=col+1;i>=0&&j<chess.length;j++,i--){
            if(chess[i][j] == 1)
                return false;
        }
        return true;

    }

}
