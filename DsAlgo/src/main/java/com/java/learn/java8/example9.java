package com.java.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;


public class example9 {
    public static void main(String[] args) {

        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        long length = friends.stream().mapToInt(s -> s.length()).sum();
        System.out.println(length);


        //As an example, let’s read over the given collection of names and display the
        //longest one. If there is more than one name with the same longest length,
        //we’ll display the first one we find.

        Optional<String> longestString = friends.stream().reduce((name1,name2)->name1.length()>name2.length()?name1:name2);
        longestString.ifPresent(System.out::println);

        Optional<Integer> longestLenth = friends.stream().map(s ->s.length()).reduce((a, b)->a>b?a:b);
        longestLenth.ifPresent(System.out::println);
    }


}
