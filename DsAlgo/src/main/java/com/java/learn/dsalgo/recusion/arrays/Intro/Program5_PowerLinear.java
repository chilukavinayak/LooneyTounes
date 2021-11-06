package com.java.learn.dsalgo.recusion.arrays.Intro;

public class Program5_PowerLinear {
    public static void main(String[] args) {
        int ans = noOf1s(-2);
        System.out.println(ans);
    }

    private static int noOf1s(int num) {
        int count =0;
        for(int i=31;i>=0;i--){
            if((1 << i & num) >= 1){
                count++;
            }
        }
        return count;
    }


}
