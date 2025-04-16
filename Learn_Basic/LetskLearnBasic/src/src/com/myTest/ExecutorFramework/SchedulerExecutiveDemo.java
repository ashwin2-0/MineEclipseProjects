package src.com.myTest.ExecutorFramework;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerExecutiveDemo {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(5);

        // Schedule the task to execute repeatedly at fixed intervals
        scheduler.scheduleAtFixedRate(() -> System.out.println("Task is getting printed."),
                0,   // Initial delay (0 seconds)
                1,   // Interval between executions (1 second)
                TimeUnit.SECONDS);

        // Wait for the task to execute 5 times, then shut down the scheduler
        Thread.sleep(5000); // Wait for 5 seconds
        scheduler.shutdown(); // Shut down the scheduler gracefully
    }
}
