package src.com.myTest.ExecutorFramework;

import java.util.List;
import java.util.concurrent.*;

public class ExecutorSericeExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Using submit() to execute a single task
        Future<String> future = executorService.submit(() -> {
            return "Task submitted successfully!";
        });
        try {
            System.out.println(future.get()); // Prints the result of the submitted task
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Using invokeAll() to execute multiple Callable tasks
        try {
            System.out.println("Executing invokeAll...");
            var taskList = List.of(
                    (Callable<String>) () -> "Task 1 completed",
                    (Callable<String>) () -> "Task 2 completed",
                    (Callable<String>) () -> "Task 3 completed"
            );

            var futures = executorService.invokeAll(taskList);
            for (Future<String> f : futures) {
                System.out.println(f.get()); // Prints the result of each task
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Using invokeAny() to get the first completed task's result
        try {
            System.out.println("Executing invokeAny...");
            String result = executorService.invokeAny(List.of(
                    (Callable<String>) () -> {
                        Thread.sleep(2000);
                        return "Task A completed quickly";
                    },
                    (Callable<String>) () -> {
                        Thread.sleep(4000);
                        return "Task B completed slowly";
                    }
            ));
            System.out.println(result); // Prints the first successfully completed task
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutting down the executor service
        executorService.shutdown();

        // Checking if the executor has terminated
        System.out.println("Executor is shut down: " + executorService.isShutdown());
        try {
            if (executorService.awaitTermination(5, TimeUnit.SECONDS)) {
                System.out.println("All tasks completed and executor terminated.");
            } else {
                System.out.println("Tasks did not complete in time.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Executor is terminated: " + executorService.isTerminated());
    }
}
