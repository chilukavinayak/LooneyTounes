package com.java.learn.dsalgo.recusion.arrays.recursionwayup;

import java.util.HashMap;

public class Program2_KeyPadCombination {
    static private HashMap<Character, String> map = new HashMap<>();

    public static void main(String[] args) {
        map.put('0', ".;");
        map.put('1', "abc");
        map.put('2', "def");
        map.put('3', "ghi");
        map.put('4', "jkl");
        map.put('5', "mno");
        map.put('6', "pqrs");
        map.put('7', "tu");
        map.put('8', "vwx");
        map.put('9', "yz");
      //  printKPC("123","");
        printKPC("78","");
    }

    private static void printKPC(String str, String asf) {
        if(str.isEmpty()){
            System.out.println(asf);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        String keys = map.get(ch);
        for(int i=0;i<keys.length();i++){
            char cc = keys.charAt(i);
            printKPC(ros,asf+cc);
        }

    }
}
