package com.learning.java8;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->printMessage());
        t1.start();

        //Using method reference
        Thread t2 = new Thread(MethodReferenceExample::printMessage);
        t2.start();
    }

    public static void printMessage() {
        System.out.println("Hello");
    }
}
