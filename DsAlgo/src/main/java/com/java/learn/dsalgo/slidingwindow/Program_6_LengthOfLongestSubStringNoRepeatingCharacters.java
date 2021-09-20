package com.java.learn.dsalgo.slidingwindow;

import java.util.HashMap;

public class Program_6_LengthOfLongestSubStringNoRepeatingCharacters {
    public static void main(String[] args) {

        int ans1 = findLength("aabccbb"); // abc -> o/p -> 3
        int ans2 = findLength("abbbb"); // abbbb -> ab -> 2
        System.out.println(ans1);
        System.out.println(ans2);
    }

    private static int findLength(String str) {

        HashMap<Character,Integer> freqMap = new HashMap<>();
        int s=0, maxLength = 0;
        for(int e=0;e<str.length();e++){
            Character rc = str.charAt(e);
            if(freqMap.containsKey(rc)){
                s = Math.max(s, freqMap.get(rc)+1);
            }
            freqMap.put(rc,e);
            maxLength = Math.max(maxLength,e-s+1);

        }
        return maxLength;
    }
}
