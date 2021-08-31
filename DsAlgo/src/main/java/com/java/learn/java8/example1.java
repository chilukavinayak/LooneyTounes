package com.java.learn.java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class example1 {

    public static void main(String[] args) {
        List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"),
                new BigDecimal("20"),
                new BigDecimal("30"),
                new BigDecimal("40"),
                new BigDecimal("50"),
                new BigDecimal("60"),
                new BigDecimal("70"),
                new BigDecimal("80")
        );

        // find price greater than 50$ and give discount of 20%
        oldSchool(prices);
        elegant(prices);
    }

    public static void oldSchool(List<BigDecimal> prices){
        BigDecimal total = BigDecimal.valueOf(0);
        for(BigDecimal price: prices){
            if(price.compareTo(BigDecimal.valueOf(50)) > 0){
                total = total.add(price.multiply(BigDecimal.valueOf(0.8)));
            }
        }
        System.out.println(total);
    }

    public static void elegant(List<BigDecimal> prices){
        BigDecimal total = prices.stream()
                .filter(price -> price.compareTo(BigDecimal.valueOf(50))>0)
                .map(a -> a.multiply(BigDecimal.valueOf(0.8)))
                .reduce(BigDecimal.ZERO,BigDecimal::add);

        System.out.println(total);
    }
}
