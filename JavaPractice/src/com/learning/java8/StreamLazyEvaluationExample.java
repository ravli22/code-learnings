package com.learning.java8;

import java.util.Arrays;
import java.util.List;

public class StreamLazyEvaluationExample {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12,22,35,46,66,82);
        System.out.println(values.stream()
                .filter(StreamLazyEvaluationExample::test)
                .findFirst()
                .orElse(0));
    }


    private static boolean test(Integer i) {
        System.out.println("Filtering " + i);
        if (i % 5 == 0) {

            return true;
        }
        return false;
    }
}
