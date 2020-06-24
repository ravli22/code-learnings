package com.learning.multithreading;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class CallableAndFuture {
    public static void main(String[] args) {
        //Callable and Future - allows to get results from threads and allows threads to throw exceptions
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<?> future = executorService.submit(() -> {
            Random random = new Random();
            int duration = random.nextInt(2000);
            if(duration>1500) {
                throw new IOException("sleeping for too long....");
            }
            try {
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return duration;
        });
        executorService.shutdown();
        try {
            System.out.println("Duration : "+future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }

    }
}
