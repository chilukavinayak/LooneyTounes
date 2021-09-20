package com.java.learn.dsalgo.slidingwindow;

import java.util.HashMap;

public class Program5_MaximumNumberOfFruitInBucket {
    public static void main(String[] args) {
        char[] fruits = {'A', 'B', 'C', 'A', 'C'};
        int ans = findLength(fruits);
        System.out.println(ans);

        char[] fruits1 = {'A', 'B', 'C', 'B', 'B', 'C'};
        int ans1 = findLength(fruits1);
        System.out.println(ans1);

    }

    private static int findLength(char[] fruits) {

        HashMap<Character,Integer> frequencyMap = new HashMap<>();
        int s=0, maxFruits=0;
        for(int e=0;e< fruits.length;e++){
            char c = fruits[e];
            frequencyMap.put(c, frequencyMap.getOrDefault(c,0)+1);

            if(frequencyMap.size() == 2){
                maxFruits = Math.max(e-s+1,maxFruits);
            }

            while(frequencyMap.size() > 2){
                char fchar = fruits[s++];
                frequencyMap.put(fchar, frequencyMap.get(fchar)-1);
                if(frequencyMap.get(fchar) == 0){
                    frequencyMap.remove(fchar);
                }
            }
        }
        return maxFruits;
    }
}
