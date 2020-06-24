package com.learning.multithreading;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultipleLocksSynchronizedBlock {

    //having synchronized blocks and declaring multiple locks for independent operations
    // on those increases the performance,as both the threads will npt be waiting for each other
    // and also they will be executing in synchronized manner
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    private void stageOne(){
        synchronized(lock1) {
            Random random = new Random();
            for (int i = 0; i < 1000; i++) {
                list1.add(random.nextInt());
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private void stageTwo(){
        synchronized (lock2) {
            Random random = new Random();
            for (int i = 0; i < 1000; i++) {
                list2.add(random.nextInt());
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        MultipleLocksSynchronizedBlock m = new MultipleLocksSynchronizedBlock();
        System.out.println("Starting");

        Thread t1 = new Thread(()->{
            m.stageOne();
            m.stageTwo();
        });
        Thread t2 = new Thread(()->{
            m.stageOne();
            m.stageTwo();
        });

        Long start = System.currentTimeMillis();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Long end = System.currentTimeMillis();

        System.out.println("Time taken : "+(end-start));
        System.out.println("List1 size : "+m.list1.size());
        System.out.println("List2 size : "+m.list2.size());
    }
}
