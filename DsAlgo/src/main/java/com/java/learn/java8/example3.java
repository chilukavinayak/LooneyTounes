package com.java.learn.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class example3 {
    public static void main(String[] args) {
        //we’re asked to convert a list of
        //names to all capital letters

        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        //Method-1
        final List<String> result1 = new ArrayList<>();
        for(String friend: friends)
            result1.add(friend.toUpperCase());
        System.out.println(result1);


        System.out.println("-------------------------");
        //Method-2
        final List<String> result2 = new ArrayList<>();
        friends.forEach((s)->result2.add(s.toUpperCase()));
        System.out.println(result2);

        System.out.println("-------------------------");
        //Method-3
        friends.stream().map(s->s.toUpperCase()).forEach(System.out::println);


    }
}
