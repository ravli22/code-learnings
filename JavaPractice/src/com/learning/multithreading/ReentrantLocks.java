package com.learning.multithreading;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLocks {
    public static void main(String[] args) {
        Sample s = new Sample();
        Thread t1 = new Thread(()-> {
            try {
                s.firstThread();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()->s.secondThread());
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        s.finished();
    }
}

class Sample {
    private int count = 0;
    //Reentrant locks : At a particular time only one thread is allowed to access the lock and the other should wait to acquire the lock on the thread.
    //once the first thread completes its process and unlocks it, the other threads can access the lock
    //we can use Condition from lock interface to await and signal the locks, similar to wait and notify
    //Ex : whenever the thread want to update the shared resource, it acquires the lock and updates and
    Lock lock = new ReentrantLock();
    Condition cond = lock.newCondition();
    private void increment() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }
    public void firstThread() throws InterruptedException {
        lock.lock();

        System.out.println("Waiting");
        cond.await();

        try {
            increment();
        }finally {
            lock.unlock();
        }
    }
    public void secondThread() {
        lock.lock();

        System.out.println("Press return key");
        new Scanner(System.in).nextLine();
        System.out.println("Got return key");
        cond.signal();

        try {
            increment();
        }finally {
            lock.unlock();
        }
    }

    public void finished() {
        System.out.println("Count value : "+count);
    }
}
