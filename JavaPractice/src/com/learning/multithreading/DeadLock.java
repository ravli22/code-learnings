package com.learning.multithreading;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {
    //DeadLock : When two threads are waiting for the locks that each other has acquired,
    // And will not go further until they acquire the locks and will be in forever waiting state.
    //This can be caused when we try to acquire locks in different orders in different threads, and in nested synchronized blocks
    //can be prevented by always acquiring the lcks in same order
    // or create a method, so that the it doesn't matter the order but it never causes deadlock situation
    public static void main(String[] args) throws InterruptedException {
        Runner r = new Runner();
        Thread t1 = new Thread(()-> {
            try {
                r.firstThread();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()-> {
            try {
                r.secondThread();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        r.finished();
    }
}

class Runner {
    private Account account1=new Account();
    private Account account2=new Account();

    Lock lock1 = new ReentrantLock();
    Lock lock2 = new ReentrantLock();

    public void aquireLocks(Lock lock1,Lock lock2) throws InterruptedException {
        while(true) {
            boolean gotFirstLock = false;
            boolean gotSecondLock = false;
            try {
                gotFirstLock = lock1.tryLock();
                gotSecondLock = lock2.tryLock();
            } finally {
                if(gotFirstLock && gotSecondLock) {
                    return;
                }
                if(gotFirstLock){
                    lock1.unlock();
                }
                if(gotSecondLock){
                    lock2.unlock();
                }
                Thread.sleep(10);
            }
        }
    }

    public void firstThread() throws InterruptedException {

        for (int i = 0; i < 10000; i++) {
           aquireLocks(lock1,lock2);
            try {
                account1.transfer(account2, new Random().nextInt(100));
            }finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }
    public void secondThread() throws InterruptedException {
        for (int i = 0; i < 10000; i++) {
            aquireLocks(lock1,lock2);
            try {
                account2.transfer(account1, new Random().nextInt(100));
            }finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }
    public void finished(){
        System.out.println("Balance in Account1 : "+account1.getBalance());
        System.out.println("Balance in Account2 : "+account2.getBalance());
        System.out.println("Total Balance in Accounts : "+(account1.getBalance()+account2.getBalance()));
    }
}

class Account {
    private int balance = 10000;

    public void deposit(int amount){
        this.balance +=amount;
    }
    public void withdraw(int amount){
        this.balance -=amount;
    }
    public void transfer(Account acc2,int amount){
        this.withdraw(amount);
        acc2.deposit(amount);
    }

    public int getBalance(){
        return this.balance;
    }

}

