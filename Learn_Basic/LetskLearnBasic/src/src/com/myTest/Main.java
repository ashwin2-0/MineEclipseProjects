package src.com.myTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> submit = executor.submit(() -> 1 + 22);
        Integer res = submit.get();
        System.out.println("Sum is :"+res);
        System.out.println("Before ShutDown :"+executor.isShutdown());
        executor.shutdown();
        System.out.println("After ShutDown : "+executor.isShutdown());
        System.out.println("After Thread Sleep :"+executor.isTerminated());

        System.out.println(executor.isTerminated());


    }
}
