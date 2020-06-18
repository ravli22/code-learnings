package com.learning.java8;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Rav","Rao",25),
                new Person("Sru","Ak",26),
                new Person("Sar","Gopi",28)
        );
        people.stream()
                .filter(p->p.getFirstName().startsWith("S") )//intermediate operation
                .forEach(p-> System.out.println(p.getFirstName()));//terminal operation

        long count = people.stream()
                .filter(p -> p.getFirstName().startsWith("S"))//intermediate operation
                .count();
        long countWithParallel = people.parallelStream()  //parallel stream performs the operations on the collection parallelly
                .filter(p -> p.getFirstName().startsWith("S"))//intermediate operation
                .count();


        System.out.println(count);
        System.out.println(countWithParallel);
    }


}
