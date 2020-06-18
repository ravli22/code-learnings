package com.learning.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class LambdaExcerciseJava8Compact {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Rav","Rao",25),
                new Person("Sru","Ak",26),
                new Person("Sar","Gopi",28)
        );
        //Step 1: Sort list by last name
        Collections.sort(people,(p1, p2)->p1.getLastName().compareTo(p2.getLastName()));
        //Step 2: Create a method prints all elements in the list
        printConditionally(people,p->true);
        //Step 3: Create a method that prints all people that have First name beginning with S
        printConditionally(people,p -> p.getFirstName().startsWith("S"));
    }

//    static void printConditionally(List<Person> people,Condition condition) {
//        for(Person p: people) {
//            if(condition.test(p)){
//                System.out.println(p);
//            }
//        }
//    }

    //instead of the above approach of creating a new interface of Condition, we can make use of Java's Predicate interface
    static void printConditionally(List<Person> people,Predicate<Person> predicate) {
        for(Person p: people) {
            if(predicate.test(p)){
                System.out.println(p);
            }
        }
    }
    @FunctionalInterface
    interface Condition {
        boolean test(Person p);
    }

}
