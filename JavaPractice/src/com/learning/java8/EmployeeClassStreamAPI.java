package com.learning.java8;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeClassStreamAPI {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John",26),
                new Employee("Cena",50),
                new Employee("Kat",18),
                new Employee("Tina",19),
                new Employee("Kat",25),
                new Employee("Tina",29)
        );

        /**
         * 1) Given a list of employees,
         * you need to filter all the employee whose age is greater than 20
         * and print the employee names.
         **/

        employees.stream()
                .filter(e->e.getAge()>20)
                .map(Employee::getName)
                .forEach(System.out::println);

        /**
         * 2) Given the list of employees, count number of employees with age 25?
         */

        long count = employees.stream()
                .filter(e -> e.getAge() == 25)
                .count();

        System.out.println("Number of employees with age 25 are :"+count);

        /**
         * Given the list of employees, find the employee with name “Kat”.
         */

        Optional<Employee> employee = employees.stream()
                .filter(e -> e.getName().equalsIgnoreCase("Kat"))
                .findAny();

        if(employee.isPresent()) {
            System.out.println(employee);

        }

        /**
         * Given a list of employee, find maximum age of employee?
         */
        OptionalInt maximumAge = employees.stream()
                .mapToInt(Employee::getAge)
                .max();
        System.out.println("Maximum age of the employees : "+maximumAge);

        /**
         * Given a list of employees, sort all the employee on the basis of age?
         */
        Collections.sort(employees, Comparator.comparing(Employee::getAge));

        //or can try below method

        //employees.sort((e1,e2)->(e1.getAge()-e2.getAge()));
        employees.forEach(System.out::println);

        /**
         *  Join the all employee names with “,” using java 8?
         */

      /*  String reduce = employees.stream()
                .map(Employee::getName)
                .reduce("", (i, j) -> i + ", " + j);
       System.out.println(reduce);

       */
        List<String> employeeNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        String empNames = String.join(",",employeeNames);
        System.out.println(empNames);

        /**
         *  Given the list of employee, group them by employee name?
         */
        Map<String, List<Employee>> emplistMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getName));

        emplistMap.forEach((name,emplist)->System.out.println("Name :"+name+", "+emplistMap));

        List<Integer> numbers = Arrays.asList(1,2,8,8,9,2);

        /**
         *Given the list of numbers, remove the duplicate elements from the list.
         */
        Set<Integer> numbersSet = numbers.stream()
                .collect(Collectors.toSet());
        numbersSet.forEach(System.out::println);

        /**
         * Given a list of numbers, square them and filter the numbers which are greater 10000 and then find average of them.
         */
        OptionalDouble average = numbers.stream()
                .mapToInt(i -> i * i)
                .filter(i -> i > 10)
                .average();

        System.out.println(average);

    }




}
class Employee {
    private String name;
    private Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
