package src.com.myTest.ExecutorFramework;

import java.util.concurrent.*;

public class CountDownLatchDemo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfService = 3;
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CountDownLatch latch = new CountDownLatch(numberOfService);
        executor.submit(new DependableService2(latch));
        executor.submit(new DependableService2(latch));
        executor.submit(new DependableService2(latch));
        latch.await();
        System.out.println("Maim");
        System.out.println("All Dependant service are finished...starting main service");
        executor.shutdown();

    }
}

class DependableService2 implements Runnable {
    private CountDownLatch latch;

    public DependableService2(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " : " + "Service Started.");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            latch.countDown();
        }
    }
}