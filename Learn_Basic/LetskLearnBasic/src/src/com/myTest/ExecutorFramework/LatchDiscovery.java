package src.com.myTest.ExecutorFramework;

import java.util.concurrent.*;

public class LatchDiscovery {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future<String> future1 = executor.submit(new DependableService());
        Future<String> future2 = executor.submit(new DependableService());
        Future<String> future3 = executor.submit(new DependableService());
        future1.get();
        future2.get();
        future3.get();
        // everytime u have to write get
        System.out.println("All Dependant service are finished...starting main service");
        executor.shutdown();

    }
}
class DependableService implements Callable<String>{

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" : "+"Service Started.");
       Thread.sleep(2000);
       return null;
    }
}