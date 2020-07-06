package com.learning.java8;

import com.sun.deploy.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Java8StreamPracticeProblems {
    public static void main(String[] args) {
        Student student1 = new Student(
                "Jayesh",
                20,
                new Address("1234"),
                Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

        Student student2 = new Student(
                "Khyati",
                20,
                new Address("1235"),
                Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

        Student student3 = new Student(
                "Jason",
                20,
                new Address("1236"),
                Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

        List<Student> students = Arrays.asList(student1, student2, student3);

        /**
         *
         * Get student with exact match name "jayesh"
         */
        String s = students.stream()
                .map(Student::getName)
                .filter(name -> name.equals("jayesh"))
                .findFirst().orElse("No Student found");
        System.out.println(s);

        /**
         * Get student with matching address "1235"
         */
        Optional<Address> optionalAddress = students.stream()
                .map(Student::getAddress)
                .filter(sa -> sa.getZipcode().equals("1235"))
                .findFirst();
        System.out.println(optionalAddress.isPresent() ? optionalAddress.get().getZipcode() : "No Student found");

        /**
         *Get all student having mobile numbers 3333.
         */
        List<Student> studentList = students.stream()
                .filter(student -> student.getMobileNumbers().stream().anyMatch(p -> p.equals("3333")))
                .collect(Collectors.toList());
        studentList.stream()
                .map(Student::getName)
                .forEach(System.out::println);
        /**
         * Get all student having mobile number 1233 and 1234
         */
        List<Student> matchingStudents = students.stream()
                .filter(sm -> sm.getMobileNumbers().stream().anyMatch(p -> (p.equals("1233")) && (p.equals("1234"))))
                .collect(Collectors.toList());
        matchingStudents.stream()
                .map(Student::getName)
                .forEach(System.out::println);

        /**
         * Create a List<Student> from the List<TempStudent>
         */
        TempStudent tmpStud1 = new TempStudent(
                "Jayesh1",
                201,
                new Address("12341"),
                Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));

        TempStudent tmpStud2 = new TempStudent(
                "Khyati1",
                202,
                new Address("12351"),
                Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));
        List<TempStudent> tempStudents = Arrays.asList(tmpStud1,tmpStud2);

        List<Student> studentList1 = tempStudents.stream()
                .map(tempStudent -> new Student(tempStudent.name, tempStudent.age, tempStudent
                        .address, tempStudent.mobileNumbers))
                .collect(Collectors.toList());
        System.out.println(studentList1);
        /**
         *  Convert List<students> to String
         */

        String str = students.stream()
                .map(Student::getName)
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println(str);

        /**
         *  Sort List<String>
         */
        Collections.sort(students, Comparator.comparing(Student::getName));

        students.stream()
                .forEach(System.out::println);

        /**
         * Change the case of List<String>
         */

    }
}
class TempStudent {
    public String name;
    public int age;
    public Address address;
    public List<MobileNumber> mobileNumbers;

    public TempStudent(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers = mobileNumbers;
    }
}

class Student{
    private String name;
    private int age;
    private Address address;
    private List<MobileNumber> mobileNumbers;

    public Student(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers = mobileNumbers;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public List<MobileNumber> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", mobileNumbers=" + mobileNumbers +
                '}';
    }
}

class Address{
    private String zipcode;

    public Address(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipcode='" + zipcode + '\'' +
                '}';
    }
}

class MobileNumber{
    private String number;

    public MobileNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "MobileNumber{" +
                "number='" + number + '\'' +
                '}';
    }
}
