package com.java.learn.dsalgo.recusion.arrays.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program1_SubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<String> result = subsequence(str);
        result.forEach(System.out::println);
    }

    private static List<String> subsequence(String str) {
        if(str.isEmpty()){
            ArrayList<String> result =  new ArrayList<>();
            result.add(" ");
            return  result;
        }

        char c = str.charAt(0);
        String ros = str.substring(1);
        List<String> sublist = subsequence(ros);

        List<String> ans = new ArrayList<>();
        for(String ss: sublist){
            ans.add(ss);
        }
        for(String ss: sublist){
            ans.add(c+ss);
        }

        return ans;

    }
}
