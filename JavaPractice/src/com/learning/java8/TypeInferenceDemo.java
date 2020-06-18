package com.learning.java8;

public class TypeInferenceDemo {
    public static void main(String[] args) {
        printlength( s -> s.length());
    }
    public static void printlength(StringLengthLambda sl){
        System.out.println(sl.getLength("Hello Everyone!"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
