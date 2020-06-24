package com.learning.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Semaphores {
    public static void main(String[] args) {
        ExecutorService  executorService = Executors.newCachedThreadPool();//It creates a new thread, whenever we submit a task
        for (int i = 0; i < 200 ; i++) {
            executorService.submit(()->Connection.getInstance().connect());
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Connection {
    private int connections = 0;
    private static Connection instance = new Connection();

    //Semaphore - is used to restrict/manages the use of limited resources
    private Semaphore sem = new Semaphore(10,true);
    private Connection() {
    }

    public static Connection getInstance() {
        return instance;
    }
    public void connect(){
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try{
            doConnect();
        }
        finally {
            sem.release();
        }
    }
    public void doConnect(){

        synchronized (this) {
            connections++;
            System.out.println("Available connections : "+connections);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            connections--;
        }
    }
}
