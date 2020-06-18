package com.learning.java8;

import java.util.Arrays;
import java.util.List;

public class StreamMapReduceExample {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);

        Integer integer = values.stream()
                .map(i -> i * 3)
                .filter(i -> (i%2) ==0)
                .reduce(1, (i, j) -> i * j);
        System.out.println(integer);


    }
}
