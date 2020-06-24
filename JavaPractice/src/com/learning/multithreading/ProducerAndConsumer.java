package com.learning.multithreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerAndConsumer {

    //Producer consumer pattern :
    //producer produces some tasks, consumer consumes them..
    //the producer and the consumer will have to communicate with each other.
    // If the buffer is full, the producer will go to sleep and will wait to be notified.
    // After the consumer will remove some data from the buffer, it will notify the producer,
    // and then, the producer will start refilling the buffer again.
    // The same process will happen if the buffer is empty, but in this case, the consumer will wait to be notified by the producer.
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()-> {
            try {
                producer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()-> {
            try {
                consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
    private static void producer() throws InterruptedException {
        while(true) {
            queue.put(new Random().nextInt(50));
        }
    }

    private static void consumer() throws InterruptedException {
        while(true) {
            Integer value = queue.take();
            System.out.println("Value taken :" + value + ". The size of the queue : " + queue.size());
        }
    }
}
