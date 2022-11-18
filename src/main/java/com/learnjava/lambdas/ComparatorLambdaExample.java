package com.learnjava.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        Comparator<Integer> ComparatorLambda = (Integer o1, Integer o2)->{return o1.compareTo(o2);};
        Comparator<Integer> comparatorLambda1 = (o1,o2)-> o1.compareTo(o2);

        System.out.println("Comparator 1 : " + comparator.compare(3,2));
        System.out.println("Comparator 2 : " + comparatorLambda1.compare(3,2));
        System.out.println("Comparator 3 : " + ComparatorLambda.compare(3,2));

    }
}
