package src.com.myTest.MultiThreading;

class MyThrad extends Thread {
    @Override
    public void run() {
        System.out.println("RUNNING"); // RUNNING
        System.out.println("in run method :" + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class HelloTest {

    public static void main(String[] args) throws InterruptedException {
        MyThrad t1 = new MyThrad();
        System.out.println(t1.getState()); // NEW
        System.out.println("in Main Class :" + Thread.currentThread().getName());
        t1.start();
        System.out.println(t1.getState()); // RUNNABLE
        System.out.println("in Main Class  before sleep:" + Thread.currentThread().getName());
        Thread.sleep(100);
        System.out.println("in Main Class  After sleep:" + Thread.currentThread().getName());
        System.out.println(t1.getState()); // TIMED_WAITING
        System.out.println("in Main Class  before join:" + Thread.currentThread().getName());
        t1.join();
        System.out.println("in Main Class  After sleep:" + Thread.currentThread().getName());
        System.out.println(t1.getState()); // TERMINATED
    }


}
