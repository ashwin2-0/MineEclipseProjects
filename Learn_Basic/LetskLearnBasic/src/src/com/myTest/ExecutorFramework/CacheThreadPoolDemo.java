package src.com.myTest.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPoolDemo {
    public static void main(String[] args) {
        // Create a cached thread pool
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Submit multiple tasks to the cached thread pool
        for (int i = 1; i <= 5; i++) {
            int taskId = i; // For clarity, use a unique ID for each task
            executorService.submit(() -> {
                System.out.println("Task " + taskId + " is being executed by: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000); // Simulate some work by making the thread sleep for 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // Shut down the executor service after submitting all tasks
        executorService.shutdown();
    }
}

