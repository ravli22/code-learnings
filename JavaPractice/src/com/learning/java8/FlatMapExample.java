package com.learning.java8;

import com.learning.InterviewQuestions.Sample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<SampleUser> userList = Arrays.asList(
                new SampleUser("Rav",25,Arrays.asList("787327854","647865384","8634875353")),
                new SampleUser("Sru",26,Arrays.asList("347356353","783683563","2635635683")),
                new SampleUser("Sar",28,Arrays.asList("673537536","6835353859","4534853535")));


        Optional<String> matchingPhoneNum = userList.stream()
                .map(user -> user.getPhoneNumbers().stream())
                .flatMap(phone -> phone.filter(p -> p.equals("783683563")))
                .findAny();
        matchingPhoneNum.ifPresent(System.out::println);

        System.out.println("Printing phone numbers using flat map");
        System.out.println(userList.stream()
                .flatMap(user->user.getPhoneNumbers().stream())
                .collect(Collectors.toList()));
        System.out.println("Printing phone numbers using map");
        System.out.println(userList.stream()
                .map(user->user.getPhoneNumbers())
                .collect(Collectors.toList()));



    }

}
class SampleUser{
    private String name;
    private Integer age;
    private List<String> phoneNumbers;

    public SampleUser(String name, Integer age, List<String> phoneNumbers) {
        this.name = name;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
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

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "SampleUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}



