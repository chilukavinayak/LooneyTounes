package com.java.learn.dsalgo.strap;

public class Demo {

    public static void main(String[] args) {

        int[] arry = {3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4};
        int k = 3;

        int result = minOperations(arry, k);
        System.out.println(result);
    }

    private static int minOperations(int[] arry, int k) {

        int count = 0;
        for(int i=0;i<k;i++){
            for(int j=0;j<arry.length;j++){
                int p1 = i+(j*k);
                int p2 = 2 * p1;
                if(p1 < arry.length && p2 < arry.length){
                        if(arry[p1] <= arry[p2]){
                            //do nothing;
                        }
                        else{

                        }
                }
                if(p1 < arry.length)
                  System.out.print(p1+" ");
            }
            System.out.println();
        }
        return count;
    }
}
