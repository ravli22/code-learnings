package com.learning.multithreading;

import java.util.Random;

public class InterruptingThreads {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting");

        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 1E6; i++) {
                Math.sin(new Random().nextDouble());
            }
        });

        t1.start();

        t1.interrupt();

        t1.join();

        System.out.println("Finished");
    }
}
