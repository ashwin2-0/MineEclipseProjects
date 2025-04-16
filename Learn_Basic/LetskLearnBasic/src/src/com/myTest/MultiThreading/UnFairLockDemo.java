package src.com.myTest.MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnFairLockDemo {
    private final Lock unFairLock = new ReentrantLock(true);

    public void accessResource() {
        unFairLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquire the lock");
            //Thread.sleep(500);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " Release the Lock.");
            unFairLock.unlock();

        }
    }

    public static void main(String[] args) {
        UnFairLockDemo example = new UnFairLockDemo();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };
        Thread m1 = new Thread(task, "Thread 1");
        Thread m2 = new Thread(task, "Thread 2");
        Thread m3 = new Thread(task, "Thread 3");
        m1.start();
        m2.start();
        m3.start();

    }

}
