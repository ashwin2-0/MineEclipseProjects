package src.com.myTest.MultiThreading;

class Test extends Thread {
    public void run() {
        try {
            for (int i = 1; i < 10; i++) {
                System.out.println("in for loop :" + i);
                Thread.sleep(2000);
            }

        } catch (InterruptedException e) {
            System.out.println("Thread got interrupted");
            throw new RuntimeException(e);
        }
        System.out.println("Thread  is  running");
    }

}

public class InterruptDemo {
    public static void main(String[] args) {
        Test m = new Test();
        m.start();
        m.interrupt();

    }

}
