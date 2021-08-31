package com.java.learn.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


//We want to filter out names that start with a certain letter. Let’s first take a
//naive approach to this using the filter() method.
public class example6 {
    public static void main(String[] args) {

        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        final List<String> editors =
                Arrays.asList("Brian", "Jackie", "John", "Mike");
        final List<String> comrades =
                Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");

        //Method-1 duplication of code
        final List<String> friendStartsWithN;
        friendStartsWithN = friends.stream().filter(s -> s.startsWith("N")).collect(Collectors.toList());
        System.out.println(friendStartsWithN);

        final List<String> editorsStartsWithN;
        editorsStartsWithN = editors.stream().filter(s -> s.startsWith("N")).collect(Collectors.toList());
        System.out.println(editorsStartsWithN);

        final List<String> comradesStartsWithN;
        comradesStartsWithN = comrades.stream().filter(s -> s.startsWith("N")).collect(Collectors.toList());
        System.out.println(comradesStartsWithN);

        Predicate<String> startsWithN =  s -> s.startsWith("N");

        final List<String> friendStartsWithN1 = friends.stream().filter(startsWithN).collect(Collectors.toList());
        final List<String> editorsStartsWithN1 = editors.stream().filter(startsWithN).collect(Collectors.toList());
        final List<String> comradesStartsWithN1 = comrades.stream().filter(startsWithN).collect(Collectors.toList());

        System.out.println(friendStartsWithN1);
        System.out.println(editorsStartsWithN1);
        System.out.println(comradesStartsWithN1);


    }
}
