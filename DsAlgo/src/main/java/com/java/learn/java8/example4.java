package com.java.learn.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class example4 {
    public static void main(String[] args) {
        //we’re asked to convert a list of
        //names to all capital letters

        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        friends.stream().map(s->s.length()).forEach(s->System.out.print(s+" "));


    }
}
