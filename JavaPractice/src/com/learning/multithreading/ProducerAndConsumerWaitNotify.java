package com.learning.multithreading;

import java.util.LinkedList;
import java.util.Random;

public class ProducerAndConsumerWaitNotify {
    public static void main(String[] args) {
        Service s = new Service();
        Thread t1 = new Thread(()->s.produce());
        Thread t2 = new Thread(()->s.consume());

        t1.start();
        t2.start();
    }
}
class Service {
    LinkedList<Integer> list = new LinkedList<>();
    private int LIMIT = 10;

    Object lock = new Object();

    public void produce() {
        while(true) {
            synchronized (lock) {
                while (list.size() == LIMIT) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                list.add(new Random().nextInt(500));
                lock.notify();
            }
        }
    }

    public void consume() {
        while(true) {
            synchronized (lock) {
                while (list.size() == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Integer value = list.removeFirst();
                System.out.println("Value removed = " + value + ".Size of the list :" + list.size());
                lock.notify();
            }
        }
    }
}
