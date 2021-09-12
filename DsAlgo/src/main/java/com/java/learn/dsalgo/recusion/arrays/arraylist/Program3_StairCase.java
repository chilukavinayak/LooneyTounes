package com.java.learn.dsalgo.recusion.arrays.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program3_StairCase{
    public static void main(String[] args) {
        List<String> ans = stairCase(3);
        System.out.println(String.join(",", ans));

        ans = stairCase_v1(3);
        System.out.println(String.join(",", ans));

    }

    private static List<String> stairCase(int n) {
        if(n < 0){
            return new ArrayList<>();
        }
        if(n == 0){
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        List<String> nm1 = stairCase(n-1);
        List<String> nm2 = stairCase(n-2);
        List<String> nm3 = stairCase(n-3);


        List<String> result = new ArrayList<>();

        result.addAll(nm1.stream().map(s -> 1 + s).collect(Collectors.toList()));
        result.addAll(nm2.stream().map(s -> 2 + s).collect(Collectors.toList()));
        result.addAll(nm3.stream().map(s -> 3 + s).collect(Collectors.toList()));

        return result;
    }
    private static List<String> stairCase_v1(int n) {
        if(n < 0){
            return new ArrayList<>();
        }
        if(n == 0){
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        List<String> nm1 = stairCase(n-1);
        List<String> nm2 = stairCase(n-2);
        List<String> nm3 = stairCase(n-3);


        List<String> result = new ArrayList<>();

        for(String path: nm1)  result.add(1 + path);
        for(String path: nm2)  result.add(2 + path);
        for(String path: nm3)  result.add(3 + path);

        return result;
    }
}