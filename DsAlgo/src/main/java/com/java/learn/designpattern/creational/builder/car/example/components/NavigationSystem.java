package com.java.learn.designpattern.creational.builder.car.example.components;

import static java.lang.Math.random;

public class NavigationSystem {

    public String getCurrentLocation() {
        int rand = (int) (random()%4);

        switch (rand){
            case 0:
               return "(361) 362-0124\n" +
                       "1006 W Jones St\n" +
                       "Beeville, Texas(TX), 78102";

            case 1:
                return "(320) 875-3441\n" +
                        "6050 40th Ave NE\n" +
                        "Murdock, Minnesota(MN), 56271";

            case 2:
                return "(408) 262-5943\n" +
                        "60 Wilson Way #SPC 172\n" +
                        "Milpitas, California(CA), 95035";
            case 3:
                return "(804) 862-3725\n" +
                        "7815 Partridge Ct\n" +
                        "Prince George, Virginia(VA), 23875";

            case 4:
                return "(410) 690-3559\n" +
                        "300 Dixon St\n" +
                        "Easton, Maryland(MD), 21601";

            default:
                return "(609) 264-7960\n" +
                        "200 12th St S #B\n" +
                        "Brigantine, New Jersey(NJ), 08203";

        }
    }
}
