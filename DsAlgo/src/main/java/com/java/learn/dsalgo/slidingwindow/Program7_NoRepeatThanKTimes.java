package com.java.learn.dsalgo.slidingwindow;

import java.util.HashMap;

public class Program7_NoRepeatThanKTimes {
    public static void main(String[] args) {
        int result = noRepeatNotMoreThanKTimes("aabccbb",2); // o/p -> 5
        System.out.println(result);

        result = noRepeatNotMoreThanKTimes("abbcb",1); // o/p -> 4
        System.out.println(result);

        result = noRepeatNotMoreThanKTimes("abccde",1); // o/p -> 3
        System.out.println(result);
    }

    private static int noRepeatNotMoreThanKTimes(String str, int k) {
        HashMap<Character,Integer> freqMap = new HashMap<>();
        int s = 0,maxRepeated=0,maxLength=0;
        for(int e=0;e<str.length();e++){
            Character rc = str.charAt(e);
            freqMap.put(rc, freqMap.getOrDefault(rc,0)+1);
            maxRepeated = Math.max(maxRepeated, freqMap.get(rc));
            if( e- s + 1 - maxRepeated > k){
                Character lc = str.charAt(s);
                freqMap.put(lc,freqMap.get(lc)-1);
                s++;
            }
            maxLength = Math.max(maxLength, e - s + 1);
        }
        return maxLength;
    }
}
