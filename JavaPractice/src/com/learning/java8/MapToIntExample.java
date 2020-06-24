package com.learning.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MapToIntExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rav","Sar","Sru","VJ","Ashu");

        List<Users> userList = names.stream()
                .map(name -> new Users(name))
                .collect(Collectors.toList());

        int sum = userList.stream()
                .mapToInt(user -> user.getAge())
                .sum();
        System.out.println(sum);
    }

}

class Users{
    private String name;
    private Integer age;

    public Users(String name) {
        this.name = name;
        this.age=30;
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
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
