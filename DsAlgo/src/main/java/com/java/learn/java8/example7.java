package com.java.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;



public class example7 {
    public static void main(String[] args) {

        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        final List<String> editors =
                Arrays.asList("Brian", "Jackie", "John", "Mike");
        final List<String> comrades =
                Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");

        //duplicate code predicate code
        Predicate<String> startsWithN =  s -> s.startsWith("N");
        Predicate<String> startsWithB =  s -> s.startsWith("B");

        final List<String> friendStartsWithN1 = friends.stream().filter(startsWithN).collect(Collectors.toList());
        final List<String> editorsStartsWithN1 = editors.stream().filter(startsWithB).collect(Collectors.toList());
        final List<String> comradesStartsWithN1 = comrades.stream().filter(startsWithN).collect(Collectors.toList());

        System.out.println(friendStartsWithN1);
        System.out.println(editorsStartsWithN1);
        System.out.println(comradesStartsWithN1);

        //Method-2
        long count1 = friends.stream().filter(checkIfStartsWith("N")).count();
        System.out.println(count1);

        long count2 = editors.stream().filter(checkIfStartsWith("B")).count();
        System.out.println(count2);

        long count3 = comrades.stream().filter(checkIfStartsWith("N")).count();
        System.out.println(count3);



        final Function<String, Predicate<String>> startsWithLetter =
                (String letter) -> {
                    Predicate<String> checkStarts = (String name) -> name.startsWith(letter);
                    return checkStarts;
                };


        //Method-2
        long count11 = friends.stream().filter(startsWithLetter.apply("N")).count();
        System.out.println(count11);

        long count22 = editors.stream().filter(startsWithLetter.apply("B")).count();
        System.out.println(count22);

        long count33 = comrades.stream().filter(startsWithLetter.apply("N")).count();
        System.out.println(count33);


        final Function<String, Predicate<String>> startsWithLetter1 = new Function<String, Predicate<String>>() {
            @Override
            public Predicate<String> apply(String letter) {
                return (String name)-> name.startsWith(letter);
            }
        };

        long count111 = friends.stream().filter(startsWithLetter1.apply("N")).count();
        System.out.println(count111);

        long count222 = editors.stream().filter(startsWithLetter1.apply("B")).count();
        System.out.println(count222);

        long count333 = comrades.stream().filter(startsWithLetter1.apply("N")).count();
        System.out.println(count333);


    }

    static Predicate<String> checkIfStartsWith(String letter){
        return s -> s.startsWith(letter);
    }
}
