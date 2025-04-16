package src.com.myTest.ExecutorFramework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainDemoByExecutorService {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(9);
        // submit in ExecutorService
        // execute in Executor   --> we cam use any of them
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                int result = factorial(finalI);
                System.out.println(result);
            });


        }
        executor.shutdown();
        try {
           // executor.awaitTermination(100, TimeUnit.MILLISECONDS);
            while(!executor.awaitTermination(1,TimeUnit.SECONDS)){
                System.out.println("Waiting..!");
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
          System.out.println("Total time :" + (System.currentTimeMillis() - startTime));
    }

    public static int factorial(int a) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }
}
