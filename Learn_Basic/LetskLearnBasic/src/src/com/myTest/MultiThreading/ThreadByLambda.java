package src.com.myTest.MultiThreading;

public class ThreadByLambda {
    public static void main(String[] args) {
        /*Runnable a = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        };
        Thread th = new Thread(a);
        th.start();*/
        Runnable a = () -> System.out.println("Hello World");
        Thread th = new Thread(a);
        th.start();

    }
}
