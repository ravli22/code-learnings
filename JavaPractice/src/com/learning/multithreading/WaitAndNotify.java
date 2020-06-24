package com.learning.multithreading;

import java.util.Scanner;

public class WaitAndNotify {
    public static void main(String[] args) {
        Demo d= new Demo();
        Thread t1 = new Thread(()-> {
            try {
               d.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()-> {
            try {
                d.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
    }
}
class Demo {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Starting the thread");
            wait(); //wait will release the lock and waits for the other thread to call notify
            System.out.println("resumed");
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this) {
            Scanner scan = new Scanner(System.in);
            Thread.sleep(100);
            System.out.println("Waiting fr the return key");
            scan.nextLine();
            notify();//notify wakes up the tread that is waiting for this object's monitor.
            System.out.println("consumer method ended");
        }
    }
}



