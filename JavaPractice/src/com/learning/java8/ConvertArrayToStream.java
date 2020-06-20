package com.learning.java8;

import java.util.stream.Stream;

public class ConvertArrayToStream {
    public static void main(String[] args) {
        String[] strArray = {"abc","bcd","ahjdv","dgdsv"};

        Stream.of(strArray)
                .filter(s->s.startsWith("a"))
                .forEach(System.out::println);
    }
}
