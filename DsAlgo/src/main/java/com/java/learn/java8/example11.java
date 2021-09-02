package com.java.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class example11 {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        final String result = friends.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
