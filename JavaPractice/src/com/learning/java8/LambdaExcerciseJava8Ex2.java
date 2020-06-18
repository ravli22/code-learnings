package com.learning.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExcerciseJava8Ex2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Rav","Rao",25),
                new Person("Sru","Ak",26),
                new Person("Sar","Gopi",28)
        );
        //Step 1: Sort list by last name
        Collections.sort(people,(p1, p2)->p1.getLastName().compareTo(p2.getLastName()));
        //Step 2: Create a method prints all elements in the list
        performConditionally(people,p->true,p->System.out.println(p));
        //Step 3: Create a method that prints all people that have First name beginning with S
        performConditionally(people,p -> p.getFirstName().startsWith("S"),p->System.out.println(p));
    }

    static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p: people) {
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }

}
