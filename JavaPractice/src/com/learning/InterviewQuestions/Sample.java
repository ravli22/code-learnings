package com.learning.InterviewQuestions;

public class Sample {

    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        Integer i1 = new Integer(23);
        Integer i2 = new Integer(23);
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));
    }
}
