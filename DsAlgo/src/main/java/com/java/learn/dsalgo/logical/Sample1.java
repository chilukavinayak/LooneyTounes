package com.java.learn.dsalgo.logical;

import java.util.*;

public class Sample1 {

    public static void main(String[] args) {
        String sentence = "a lazy dog jump over the crazy dog and cat jump over the dog and jump and jump crazy crazy crazy";
        List<String> bannedList = Arrays.asList("jump", "cat", "the", "and");
        String mfw = getfrequencyWord(sentence,bannedList);
        System.out.println(mfw);
        int ans = noOfOneInTheNumber(7);
      //   System.out.println(ans);
    }

   static  int noOfOneInTheNumber(int n){
        int count = 0;
        for(int i=31;i>=0;i--){
            if((1<<i & n) >= 1 ) {
                System.out.print("1");
                count++;
            }
            else{
                System.out.print("0");
            }
        }
        return count;
    }



    static String getfrequencyWord(String sentence, List<String> bannedList){

        List<String> words = Arrays.asList(sentence.split(" "));

        Set<String> bannedSet = new HashSet<String>();

        for(String bannedString : bannedList){
            bannedSet.add(bannedString);
        }

        Map<String,Integer> wordFrequency = new HashMap<>();

        for(String word : words){

            if(!bannedSet.contains(word)){
                wordFrequency.put(word, wordFrequency.getOrDefault(word,0)+1);
            }
        }

        String maxString = null;
        int max = 0;
        for(Map.Entry<String,Integer> entry : wordFrequency.entrySet()){
            if(max < entry.getValue()){
                max = entry.getValue();
                maxString = entry.getKey();
            }
        }
        return maxString;

    }

}
