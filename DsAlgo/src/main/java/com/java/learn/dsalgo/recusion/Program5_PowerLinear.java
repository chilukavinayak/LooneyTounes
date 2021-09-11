package com.java.learn.dsalgo.recusion;

public class Program5_PowerLinear {
    public static void main(String[] args) {
        int ans = power(2,5);
        System.out.println(ans);
    }
    static public int power(int x,int n){
        if(n == 0)
            return 1;
        return x*power(x,n-1);
    }
}
