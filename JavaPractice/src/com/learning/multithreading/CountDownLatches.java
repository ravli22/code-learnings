package com.learning.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountDownLatches {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        //CountDownLatch is used : when we want to execute some tasks before the other tasks is started, eg some kind of initialization
        //When we use this, and mention how many tasks need to be completed and call latch .countdown(), everytime, that particlar task is completed,
        // after all the countdowns are done and latch reaches zero,(latch.await()) it will allow any other threads, to continue doing their own operation

        CountDownLatch latch = new CountDownLatch(3);
        for (int i = 0; i <3 ; i++) {
            executorService.submit(new DependentService(latch));
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All dependent services are initialized");

        executorService.shutdown();


    }
}

class DependentService implements Runnable {
    private CountDownLatch latch;

    public DependentService(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        //startup task
        System.out.println("Started");
        latch.countDown();
        //continue with other tasks
    }
}
