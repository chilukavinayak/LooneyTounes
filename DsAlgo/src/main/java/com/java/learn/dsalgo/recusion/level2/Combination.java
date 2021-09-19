package com.java.learn.dsalgo.recusion.level2;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int n = sc.nextInt();
        combination(1,n,r,0,"");

    }

    public static void combination(int cb,int tb, int ssf, int ts, String asf){
        if(cb > tb) {
            if (ssf == ts) {
                System.out.println(asf);

            }
            return;
        }

        combination(cb+1,tb,ssf+1,ts,asf+"i");
        combination(cb+1,tb,ssf,ts,asf+"-");
    }
}
