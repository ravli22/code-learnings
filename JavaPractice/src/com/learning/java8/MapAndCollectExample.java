package com.learning.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndCollectExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rav","Sar","Sru");
        names.stream()
                .filter(s->!s.equals("Rav"))
                .map(name->new User(name))
                .forEach(System.out::println);
        names.stream()
                .filter(s->!s.equals("Rav"))
                .map(name->new User(name))
                .collect(Collectors.toList());

     }
}

class User{
    private String name;
    private Integer age;

    public User(String name) {
        this.name = name;
        this.age = 27;
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
