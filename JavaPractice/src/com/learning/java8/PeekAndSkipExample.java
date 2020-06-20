package com.learning.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekAndSkipExample {
    public static void main(String[] args) {
        List<String> list = Stream.of("One", "Two", "Three")
                .filter(s -> !s.equals("One"))
                .peek(p->System.out.println("Peaked "+p))
                .collect(Collectors.toList());

        List<Integer> integerList = Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .skip(2)
                .filter(i -> i < 5)
                .collect(Collectors.toList());

        System.out.println(integerList);

    }
}
