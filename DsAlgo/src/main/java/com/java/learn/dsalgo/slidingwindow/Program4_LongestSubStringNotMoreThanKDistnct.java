package com.java.learn.dsalgo.slidingwindow;

import java.util.HashMap;

public class Program4_LongestSubStringNotMoreThanKDistnct {
    public static void main(String[] args) {
        System.out.println(longestSubStringNotMoreThanKDistinct("arraci",2));//4
        System.out.println(longestSubStringNotMoreThanKDistinct("arraci",1));//2
        System.out.println(longestSubStringNotMoreThanKDistinct("cbbebi",3));//5
    }

    private static int longestSubStringNotMoreThanKDistinct(String str, int k) {
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        int sw = 0,ans=Integer.MIN_VALUE;
        for(int ew = 0;ew<str.length();ew++){
            Character ch = str.charAt(ew);
            charFrequency.put(ch,charFrequency.getOrDefault(ch,0)+1);

            if(charFrequency.size() == k)
                ans = Math.max(ans, ew-sw+1);

            while(charFrequency.size() > k){
                Character fchar = str.charAt(sw);
                charFrequency.put(fchar,charFrequency.get(fchar)-1);
                if(charFrequency.get(fchar) == 0){
                    charFrequency.remove(fchar);
                }
                sw++;
            }
        }
        return ans;
    }
}
