package com.java.learn.dsalgo.recusion.level2;

public class Program4_PerCom {
    public static void main(String[] args) {
        percom("ABC","");
    }

    private static void percom(String str,String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            percom(left+right, asf + ch);
        }
    }
}
