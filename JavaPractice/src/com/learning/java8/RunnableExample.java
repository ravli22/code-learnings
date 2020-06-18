package com.learning.java8;

public class RunnableExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside run method");
            }
        });
        t1.run();

        //Writing the above using lambda Expression

        Thread lambdaThread = new Thread(()->System.out.println("inside run of lambda expression"));
        lambdaThread.run();

    }
}
