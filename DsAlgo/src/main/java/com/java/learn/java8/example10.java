package com.java.learn.java8;

import java.util.Arrays;
import java.util.List;

public class example10 {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        //print

        for(String friend: friends){
            System.out.print(friend+", ");
        }
        System.out.println();

        //output: Brian,Nate,Neal,Raju,Sara,Scott,

        //observation at end we extra ,
        //to handle this we need fall back treditional looping

        //quick fix
        for(int i=0;i<friends.size();i++){
            if(i < friends.size() - 1)
                System.out.print(friends.get(i)+", ");
            else
                System.out.println(friends.get(i));
        }

        // above code not concise not readable

        System.out.println(String.join(", ", friends));

    }
}
