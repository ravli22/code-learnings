package com.learning.multithreading;

import java.util.Scanner;

public class VolatileKeyword {
    public static void main(String[] args) {
        Processor p1 = new Processor();
        p1.start();

        System.out.println("Press enter to stop");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();



        p1.shutdown();
    }
}

class Processor extends Thread {
    //volatile : keyword is used to specify that this value should not be cached
    // and The threads will read and write this variable directly from and to the memory
    //Thus, changes are visible to all threads.
    private volatile  boolean running = true;


    @Override
    public void run() {
        while(running) {
            System.out.println("Hello");
        }
        try {
            Thread.sleep(100);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void shutdown() {
        running=false;
    }
}
