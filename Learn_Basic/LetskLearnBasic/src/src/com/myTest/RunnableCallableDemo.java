package src.com.myTest;

import java.util.concurrent.*;

public class RunnableCallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        // Runnable runnable = () -> "Hello ";  // this is wrong  as Runnable method run() return nothing void();
        Runnable runnable = () -> System.out.println("Hello");
        Callable callale = () -> "Hello";
        // Future<?> future = executorService.submit(() -
        //  Future<String> future = executorService.submit( () -> "Hello");  this will work fine
        // basically agar kuchh return karvana hai to callable use karo ,aur agar kuchh bhi return nhi karwana hai to
        // runnable use karo
        Future<String> future = executorService.submit(runnable,"Success");
        System.out.println(future.get());
        if (future.isDone()) {
            System.out.println("Job is Done from  future");
        }
        System.out.println("is ShutDown :" + executorService.isShutdown());
        executorService.shutdown();
        System.out.println("is ShutDown :" + executorService.isShutdown());

    }

}
