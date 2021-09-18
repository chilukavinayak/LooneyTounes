package com.java.learn.dsalgo.logical;

public class powerOfTwo {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){ // true expected test
            System.out.println(powerOfTwo(1<<i));
        }
        for(int i=0;i<=10;i++){ // false expected test
            System.out.println(powerOfTwo((1<<i)-1));
        }
    }
    public static boolean powerOfTwo(int n){
        return ((n & n-1) == 0);
    }
}
