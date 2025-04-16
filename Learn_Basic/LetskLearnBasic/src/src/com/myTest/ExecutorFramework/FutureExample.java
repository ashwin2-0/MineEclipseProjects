package src.com.myTest.ExecutorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Submit a task to the executor
        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Task is running...");
            Thread.sleep(3000); // Simulate a long-running task
            return 42; // Return a result
        });

        // Perform some other operations while the task is running
        System.out.println("Doing other work while task runs...");

        try {
            // Check if the task is done
            if (!future.isDone()) {
                System.out.println("Task is still running...");
            }

            // Get the result of the task
            Integer result = future.get(); // This will block until the task is complete
            System.out.println("Task completed! Result: " + result);

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shut down the executor
        executorService.shutdown();
    }
}
