package com.learning.multithreading;

import org.omg.Messaging.SyncScopeHelper;

public class StartingThreads {
    public static void main(String[] args) {
        Example t1 = new Example(); //extending Thread class

        Thread t2 = new Thread(new Example2());//implementing Runnable interface

        //by using anonymous inner class
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10 ; i++) {
                    System.out.println("This is run method in Anonymous class "+i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        //by using lambda expression
        Thread t4 = new Thread(()->{
            for (int i = 0; i < 10 ; i++) {
                System.out.println("This is run method from Lambda Expression "+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

class Example extends Thread{
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println("This is run method in Example class "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Example2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println("This is run method in Example2 class "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
