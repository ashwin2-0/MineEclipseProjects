package src.com.myTest.ExecutorFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorSchedulerMethod {
    public static void main(String[] args) throws InterruptedException {
        // Create a ScheduledExecutorService with a thread pool of 2
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // 1. Using schedule(): Execute a task once after a delay
        scheduler.schedule(() -> {
            System.out.println("Task 1 (schedule): Executed after 2 seconds.");
        }, 2, TimeUnit.SECONDS);

        // 2. Using scheduleAtFixedRate(): Execute a task repeatedly at a fixed rate
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Task 2 (scheduleAtFixedRate): Repeating every 3 seconds.");
        }, 1, 3, TimeUnit.SECONDS); // Initial delay: 1 second, Interval: 3 seconds

        // 3. Using scheduleWithFixedDelay(): Execute a task repeatedly with a fixed delay
        scheduler.scheduleWithFixedDelay(() -> {
            System.out.println("Task 3 (scheduleWithFixedDelay): Repeating with a 2-second delay after each execution.");
        }, 1, 2, TimeUnit.SECONDS); // Initial delay: 1 second, Delay between tasks: 2 seconds

        // Wait for some time to observe the execution of tasks
        Thread.sleep(10000); // Let the tasks run for 10 seconds

        // Shut down the scheduler gracefully
        System.out.println("Shutting down the scheduler...");
        scheduler.shutdown();

        // Wait for tasks to complete after shutdown
        if (scheduler.awaitTermination(5, TimeUnit.SECONDS)) {
            System.out.println("All tasks completed.");
        } else {
            System.out.println("Timeout: Tasks did not complete in time.");
        }
    }
}
