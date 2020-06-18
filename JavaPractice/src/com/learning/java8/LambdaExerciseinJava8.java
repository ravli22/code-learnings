package com.learning.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExerciseinJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Rav","Rao",25),
                new Person("Sru","Ak",26),
                new Person("Sar","Gopi",28)
        );
        //Step 1: Sort list by last name
        Collections.sort(people,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
        //Step 2: Create a method prints all elements in the list
        people.forEach(System.out::println);
        //Step 3: Create a method that prints all people that have First name beginning with S
        people.forEach((p)->{
            if(p.getFirstName().startsWith("S")){
                System.out.println(p);
            }
        });


    }
}
