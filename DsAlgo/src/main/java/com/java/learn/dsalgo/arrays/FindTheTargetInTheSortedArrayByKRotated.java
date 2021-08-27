package com.java.learn.dsalgo.arrays;

public class FindTheTargetInTheSortedArrayByKRotated {

    public static void main(String[] args) {
        int[] arr = new int[]{4,5,6,7,8,1,2,3};
        int index = find(arr,3);
        System.out.println(index);
    }

   static public int find(int[] arr,int target){
        int low = 0;
        int hi = arr.length-1;


        while(low <= hi){
            int mid = (low+hi)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[low] <= arr[mid]){
                if(target >= arr[low] && target < arr[mid]){
                    hi = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else if(arr[mid] <= arr[hi]){
                if(target > arr[mid] && target <= arr[hi])
                {
                    low = mid+1;
                }
                else{
                    hi = mid-1;
                }
            }

        }
        return -1;
    }
}
