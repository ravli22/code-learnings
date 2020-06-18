package com.learning.java8;

import java.util.Arrays;
import java.util.List;

public class StreamAPIMethodsExample {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12,22,334,46,66,82);
        System.out.println(values.stream()
                .filter(i->i%5==0)
                .findFirst().orElse(0));

    }
}
