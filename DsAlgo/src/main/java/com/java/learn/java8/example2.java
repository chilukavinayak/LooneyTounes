package com.java.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class example2 {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        //method-1
        for(int i=0;i<friends.size();i++){
            System.out.println(friends.get(i));
        }
        System.out.println("-------------------------");
        //method-2
        for(String friend: friends)
            System.out.println(friend);

        System.out.println("-------------------------");

        //method-3
        friends.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("-------------------------");

        //method-4
        friends.forEach((String s)-> System.out.println(s));

        System.out.println("-------------------------");

        //method-5
        friends.forEach(s-> System.out.println(s));

        System.out.println("-------------------------");

        //method-6
        friends.forEach(System.out::println);


    }
}
