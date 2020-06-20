package com.learning.java8.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"Rav",25),
                new Employee(2,"Sar",26),
                new Employee(3,"Sru",27),
                new Employee(4,"Ashu",26),
                new Employee(5,"VJ",28)
        );



        Collections.sort(employeeList,Comparator.comparing(Employee::getName));

        System.out.println("Printing the list , sorting with employee's name");
        employeeList.forEach(System.out::println);

        Collections.sort(employeeList,Comparator.comparing(Employee::getAge));

        System.out.println("Printing the list, sorting with employee's age");
        employeeList.forEach(System.out::println);

        Collections.sort(employeeList,Comparator.comparing(Employee::getName).reversed());

        System.out.println("Printing the list in descending order, sorting with employee's name");
        employeeList.forEach(System.out::println);

        Collections.sort(employeeList,Comparator.comparing(Employee::getId).reversed());

        System.out.println("Printing the list in descending order, sorting with employee's id");
        employeeList.forEach(System.out::println);

        Collections.sort(employeeList,Comparator.comparing(Employee::getId).thenComparing(Employee::getAge));

        System.out.println("Printing the list , sorting with employee's id first and then with ep's name");
        employeeList.forEach(System.out::println);

        List<Employee> employeeList2 = Arrays.asList(
                new Employee(1,"Rav",25),
                new Employee(2,"Sar",26),
                new Employee(3,"Sru",27),
                new Employee(4,"Ashu",26),
                new Employee(5,"VJ",28)
        );

        Collections.sort(employeeList2,Comparator.naturalOrder());

        System.out.println("Printing the list , sorting with natural order");
        employeeList2.forEach(System.out::println);


        Collections.sort(employeeList2,Comparator.reverseOrder());

        System.out.println("Printing the list , sorting with natural order in descending order");
        employeeList2.forEach(System.out::println);


    }
}
