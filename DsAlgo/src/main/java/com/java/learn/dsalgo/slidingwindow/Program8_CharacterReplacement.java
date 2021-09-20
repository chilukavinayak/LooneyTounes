package com.java.learn.dsalgo.slidingwindow;

import java.util.HashMap;

public class Program8_CharacterReplacement {
  public static int findLength(String str, int k) {
    HashMap<Character,Integer> freMap = new HashMap<>();
    int maxRepeat = 0,s = 0,length=0;
    for(int e=0;e<str.length();e++){
      char rc = str.charAt(e);
      freMap.put(rc, freMap.getOrDefault(rc, 0)+1);
      maxRepeat = Math.max(maxRepeat, freMap.get(rc));

      if(e-s+1-maxRepeat > k){
        char lc = str.charAt(s);
        freMap.put(lc,freMap.get(lc)-1);
        s++;
      }

      length = Math.max(length, e-s+1);


    }
    return length;
  }
}
