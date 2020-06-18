package com.learning.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Rav","Rao",25),
                new Person("Sru","Ak",26),
                new Person("Sar","Gopi",28)
        );
        //Step 1: Sort list by last name
        Collections.sort(people,new LastNameComparator());
        //Step 2: Create a method prints all elements in the list
        for(Person p : people){
            System.out.println(p);
        }
        //Step 3: Create a method that prints all people that have First name beginning with S
        System.out.println("Printing the persons whose names start with S");
        for(Person p: people){
            if(p.getFirstName().charAt(0)=='S') {
                System.out.println(p);
            }
        }
    }
}

class LastNameComparator implements Comparator<Person>{

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getLastName().compareTo(p2.getLastName());
    }
}
