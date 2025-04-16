package src.com.myTest.ExecutorFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;


public class ExecutorServiceExampleDeep {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future<String> future = executor.submit(() -> {
            return "task is submitted Successfully..";
        });
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException f) {
            f.printStackTrace();
        }
        // lets try using invoke ALl
        try {
            System.out.println("Invoking All");
            var taskList = List.of((Callable<String>) () -> " Task 1 is Completed", (Callable<String>) () -> " Task 2 is Completed", (Callable<String>) () -> " Task 3 is Completed", (Callable<String>) () -> " Task 4 is Completed");
            var invokeList = executor.invokeAll(taskList);
            for (Future<String> list : invokeList) {
                System.out.println(list.get());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println("Executing invokeAny...");
            String result = executor.invokeAny(List.of((Callable<String>) () -> {
                Thread.sleep(2000);
                return "Task A completed quickly from invoke any ";
            }, (Callable<String>) () -> {
                Thread.sleep(4000);
                return "Task B completed slowly from invoke any ";
            }));
            System.out.println(result); // Prints the first successfully completed task
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
// Shutting down the executor service
        executor.shutdown();

        System.out.println("Executor is shut down: " + executor.isShutdown());
        try {
            if (executor.awaitTermination(5, TimeUnit.SECONDS)) {
                System.out.println("All tasks completed and executor terminated.");
            } else {
                System.out.println("Tasks did not complete in time.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Executor is terminated: " + executor.isTerminated());
    }


}
