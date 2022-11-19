package com.learnJava.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> predicate = (i) -> i%2 == 0;
    static Predicate<Integer> predicate2 = i -> i%5 == 0;

    public static void main(String[] args) {
        System.out.println(predicate.or(predicate2).test(14));
        System.out.println(predicate.and(predicate2).test(20));
        System.out.println(predicate.and(predicate2).negate().test(20));
    }
}
