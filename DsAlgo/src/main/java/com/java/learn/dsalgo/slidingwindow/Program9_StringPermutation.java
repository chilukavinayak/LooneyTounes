package com.java.learn.dsalgo.slidingwindow;

import java.util.HashMap;

public class Program9_StringPermutation {
  public static void main(String[] args) {
    System.out.println(findPermutation("oidbcaf","abc")); // true
    System.out.println(findPermutation("odicf","dc")); // false
    System.out.println(findPermutation("bcdxabcdy","bcdyabcdx")); // true
    System.out.println(findPermutation("aaacb","abc")); // true
  }
  public static boolean findPermutation(String str, String pattern) {

    int matched = 0,windowStart=0;
    HashMap<Character, Integer> charFrequencyMap = new HashMap<>();
    for(char chr : pattern.toCharArray()){
      charFrequencyMap.put(chr,charFrequencyMap.getOrDefault(chr,0)+1);
    }

    for(int windowEnd=0;windowEnd<str.length();windowEnd++){
      char rightChar = str.charAt(windowEnd);

      if(charFrequencyMap.containsKey(rightChar)){
        charFrequencyMap.put(rightChar, charFrequencyMap.get(rightChar)-1);
        if(charFrequencyMap.get(rightChar) == 0)
          matched++;
      }

      if(matched == charFrequencyMap.size())
        return true;

      if(windowEnd >= pattern.length()-1){
        char lc = str.charAt(windowStart++);
        if(charFrequencyMap.containsKey(lc)){
          if(charFrequencyMap.get(lc) == 0)
            matched--;

          charFrequencyMap.put(lc, charFrequencyMap.get(lc)+1);
        }
      }

    }
    return false;
  }
}
