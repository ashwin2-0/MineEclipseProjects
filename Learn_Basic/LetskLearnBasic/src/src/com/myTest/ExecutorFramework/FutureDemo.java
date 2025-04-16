package src.com.myTest.ExecutorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> future = executorService.submit(
                        () -> {
                            System.out.println("Hello");
                          //  return "Task is completed";  if u not return here it will simply print null here every
                            //time because exector.submit here is taking runnable and runnable returs nothing
                        }

        );
        System.out.println("future.get() before :"+future.get());
        if (future.isDone()) {
            System.out.println("Job is Done from  future");
        }
        System.out.println("future.get() after :"+future.get());
        System.out.println("is ShutDown :"+executorService.isShutdown());
        executorService.shutdown();
        System.out.println("is ShutDown :"+executorService.isShutdown());

    }
}
