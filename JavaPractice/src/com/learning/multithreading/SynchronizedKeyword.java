package com.learning.multithreading;

public class SynchronizedKeyword {
    private int count = 0;
    public static void main(String[] args) {
        SynchronizedKeyword sync = new SynchronizedKeyword();
        sync.doWork();
    }

    //synchronized : when a thread is executeing a synchronized method, it has to acquire lock on the method,
    // and it releases the lock only after the full execution of that method,
    // and any thread accessing the same method has to wait until first thread releases the lock .
    //This ensures that, here the incrementing of the counter is done in on step,
    // rather than 3 different steps(read the count value, increment it and store the count value)
    public synchronized void increment() {
        count++;
    }

    public void doWork(){
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join(); //asking main thread to join after t1
            t2.join();//asking main thread to join after t2 execution
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("final count : "+count);
    }
}
