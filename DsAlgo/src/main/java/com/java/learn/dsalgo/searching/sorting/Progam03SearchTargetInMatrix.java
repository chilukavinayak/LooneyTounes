package com.java.learn.dsalgo.searching.sorting;

import java.util.Scanner;

public class Progam03SearchTargetInMatrix {

    /*your task is to complete this function which returns true if target exists in the matrix
    else return false*/
    public static boolean search(int[][]matrix, int target) {


        int row = binarySearchInPotentialRow(matrix,target);
        if(row == -1)
            return false;

        return binarySearch(matrix, row, target);

    }
    public static boolean binarySearch(int[][] matrix, int row, int target){
        int low = 0;
        int high = matrix[0].length;
        while(low < high){
            int mid = (low+high)/2;
            if(matrix[row][mid] == target)
                return true;
            else if(target > matrix[row][mid]  ){
                low = mid + 1;
            }
            else if(target < matrix[row][mid]){
                high = mid -1;
            }
        }
        return false;
    }

    public static int binarySearchInPotentialRow(int[][] matrix, int target){


        int low = 0;
        int high = matrix[0].length-1;
        int cs = matrix[0].length-1;

        while(low <= high){
            int mid = (low + high)/2;
            if(target >= matrix[mid][0] && target <= matrix[mid][cs] ){
                return mid;
            }
            else if(target < matrix[mid][0]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        int[][]matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        int target = scn.nextInt();

        boolean isFound = search(matrix, target);
        System.out.println(isFound);

    }
}