package com.java.learn.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class example5 {
    public static void main(String[] args) {
        //let’s pick the ones that start with the letter N. Since
        //there may be zero matching names in the list, the result may be an empty
        //list. Let’s first code it using the old approach

        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");


        //Method-1
        final List<String> result1 = new ArrayList<>();

        for(String friend:friends){
            if(friend.startsWith("N"))
                result1.add(friend);
        }
        System.out.println(result1);


        //Method-2

        List<String> result2 = friends
                .stream()
                .filter(s->s.startsWith("N"))
                .collect(Collectors.toList());
        System.out.println(result2);

    }
}
