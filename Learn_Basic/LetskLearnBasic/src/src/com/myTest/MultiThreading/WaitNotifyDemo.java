package src.com.myTest.MultiThreading;
class SharedResource {
    public synchronized void waitForSignal() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting...");
            wait(); // Thread goes into waiting state
            System.out.println(Thread.currentThread().getName() + " has been notified and resumed!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendSignal() {
        System.out.println(Thread.currentThread().getName() + " is sending a notify signal...");
        notify(); // Notifies one waiting thread
    }

    public synchronized void sendSignalToAll() {
        System.out.println(Thread.currentThread().getName() + " is sending a notifyAll signal...");
        notifyAll(); // Notifies all waiting threads
    }
}

public class WaitNotifyDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        // Create threads that wait for a signal
        Runnable waitingTask = () -> {
            resource.waitForSignal();
        };

        Thread t1 = new Thread(waitingTask, "Thread-1");
        Thread t2 = new Thread(waitingTask, "Thread-2");
        Thread t3 = new Thread(waitingTask, "Thread-3");
        Thread t4 = new Thread(waitingTask, "Thread-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Let the threads reach the waiting state
        Thread.sleep(1000);

        // Send a notify signal (to wake up one thread)
        resource.sendSignal();

        // Wait for some time and then notify all remaining threads
        Thread.sleep(1000);
        resource.sendSignalToAll();
    }
}