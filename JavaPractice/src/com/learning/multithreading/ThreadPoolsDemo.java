package com.learning.multithreading;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolsDemo {
    public static void main(String[] args) {
        //ExecutorService here helps to manage pool of threads.Controls the nuber of threads the aapp is creatng
        //We submit the tasks to the executor service and no of threads to create,
        // and executor service takes care of assigning the tasks to the threads,
        // and once a thread completes it taks , it starts executing another task
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5 ; i++) {
            executor.submit(new Worker(i));
        }
        executor.shutdown();

        System.out.println("All tasks submitted");

        try {
            executor.awaitTermination(1,TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All tasks completed");

    }
    }


class Worker implements Runnable {
    private int id;

    public Worker(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Starting "+id);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed "+id);
    }

}
