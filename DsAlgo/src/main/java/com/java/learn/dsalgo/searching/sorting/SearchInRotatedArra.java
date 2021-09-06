package com.java.learn.dsalgo.searching.sorting;

import java.util.Scanner;

public class SearchInRotatedArra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arry = new int[n];

        for(int i=0;i<n;i++){
            arry[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int index = searchInRotatedArray(arry, target);
        System.out.println(index);

    }

    private static int searchInRotatedArray(int[] arry, int target) {
        int low = 0;
        int high = arry.length-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(target == arry[mid])
                return mid;

            if(arry[low] <= arry[mid]){
                if(target <= arry[low] && target >= arry[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }

            }
            else{

                if(target >= arry[mid+1] && target <= arry[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }

            }
        }
        return -1;
    }
}
