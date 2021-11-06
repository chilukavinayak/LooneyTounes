package com.java.learn.junk;

import java.util.HashMap;

public class Sample {
    public static void main(String[] args) {

        keycombinations("12","");
    }

    private final static HashMap<Character, String> map = new HashMap<>();
    static {
        map.put('1',"abc");
        map.put('2', "def");
        map.put('3', "ghi");
    }

    static void keycombinations(String num, String asf){
        if(num.length() == 0){
            System.out.println(asf);
            return;
        }

        Character digit = num.charAt(0);
        String ros = num.substring(1);

        String encode = map.get(digit);

        for(int i=0;i<encode.length();i++){
            keycombinations(ros,asf+encode.charAt(i));
        }

    }
}
