package com.learning.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceEx2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Rav","Rao",25),
                new Person("Sru","Ak",26),
                new Person("Sar","Gopi",28)
        );

        //Step 2: Create a method prints all elements in the list
        performConditionally(people,p->true,System.out::println);//p->method(p)  or () -> method() - replace it with method reference

    }

    static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p: people) {
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }
}
