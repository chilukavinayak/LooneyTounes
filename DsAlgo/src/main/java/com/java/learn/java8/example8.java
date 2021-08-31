package com.java.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class example8 {
    public static void main(String[] args) {

        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        //Method-1
        String foundName = null;
        for(String friend: friends){
            if(friend.startsWith("N")){
                foundName = friend;
                break;
            }
        }

        if(foundName == null)
            System.out.println("Not found");
        else
            System.out.println(foundName);


        System.out.println("---------------------");

        //Method-2
        pickName(friends,"N");
        pickName(friends,"Z");

    }
    public static void pickName(List<String> friends, String letter){

        Optional<String> found = friends.stream().filter(s->s.startsWith(letter)).findFirst();
        System.out.println(String.format("Friend starts with %s and Name -> %s",letter, found.orElse("not found")));
        found.ifPresent(name -> System.out.println("Hello "+name));
    }

}
