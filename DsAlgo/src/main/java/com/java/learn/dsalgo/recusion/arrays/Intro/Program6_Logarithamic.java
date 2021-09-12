package com.java.learn.dsalgo.recusion.arrays.Intro;

public class Program6_Logarithamic {
    public static void main(String[] args) {
        long ans = power(2,10);
        System.out.println(ans);
        ans = power(5,13);
        System.out.println(ans);
    }
    public static long power(int x,int n){
        if(n == 0)
            return 1;


        long xpnb2 =  power(x,n/2);

        long xn =xpnb2*xpnb2;


        if(n%2 == 1)
            xn = xn * x;


        return xn;
    }
}
