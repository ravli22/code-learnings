package com.learning.java8;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Rav","Rao",25),
                new Person("Sru","Ak",26),
                new Person("Sar","Gopi",28)
        );

        //Step 2: Create a method prints all elements in the list
        people.forEach(System.out::println);//this is external iteration

    }

}
