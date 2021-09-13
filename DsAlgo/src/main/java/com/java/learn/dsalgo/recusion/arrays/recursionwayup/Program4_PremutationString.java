package com.java.learn.dsalgo.recusion.arrays.recursionwayup;

public class Program4_PremutationString {
    public static void main(String[] args) {
        String str = "abc";
        permutation(str,"");
    }
    //bc,a |
    private static void permutation(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++){ // 1
            char ch = str.charAt(i);//a
            String left = str.substring(0,i);//""
            String right = str.substring(i+1);//""
            String ros = left+right; // ""+""
            permutation(ros,ans+ch); // "",abc
        }
    }
}
