package com.java.learn.dsalgo.recusion.arrays.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Program4_GetMazePath {

    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        List<String> ans = getMazePath(1,1,n,m);
        System.out.println(ans);
    }



    private static List<String> getMazePath(int i,int j,int n, int m) {

        if(i > n || j > m ){
            List<String> base = new ArrayList<>();
            return base;
        }

        if(i == n && j == m){
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        List<String> hd = getMazePath(i,j+1,n,m);
        List<String> vd = getMazePath(i+1,j,n,m);

        List<String> paths = new ArrayList<>();
        for(String path : hd){
            paths.add("h"+path);
        }
        for(String path : vd){
            paths.add("v"+path);
        }

        return paths;

    }

}
