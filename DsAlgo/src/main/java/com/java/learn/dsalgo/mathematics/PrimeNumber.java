package com.java.learn.dsalgo.mathematics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2;i<=30;i++){
            System.out.println(i +" isPrime "+ isPrime(i));
        }
        boolean result = isPrime(n);
        System.out.println(result);
    }

    private static boolean isPrime(int n) {

        for(int i=2;i<n;i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
