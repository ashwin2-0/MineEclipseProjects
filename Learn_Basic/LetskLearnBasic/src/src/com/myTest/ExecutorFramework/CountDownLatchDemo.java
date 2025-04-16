package src.com.myTest.ExecutorFramework;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3); // 3 threads ka wait karega

        // Worker threads ban rahe hain
        Thread worker1 = new Thread(() -> {
            System.out.println("Worker 1 kaam kar raha hai...");
            try {
                Thread.sleep(1000); // Kaam ko simulate karne ke liye
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 1 kaam khatam!");
            latch.countDown(); // Count reduce karo
        });

        Thread worker2 = new Thread(() -> {
            System.out.println("Worker 2 kaam kar raha hai...");
            try {
                Thread.sleep(2000); // Kaam ko simulate karne ke liye
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 2 kaam khatam!");
            latch.countDown(); // Count reduce karo
        });

        Thread worker3 = new Thread(() -> {
            System.out.println("Worker 3 kaam kar raha hai...");
            try {
                Thread.sleep(3000); // Kaam ko simulate karne ke liye
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 3 kaam khatam!");
            latch.countDown(); // Count reduce karo
        });

        // Workers start karte hain
        worker1.start();
        worker2.start();
        worker3.start();

        // Main thread wait karega jab tak workers ka kaam complete na ho
        System.out.println("Main thread workers ka kaam complete hone ka wait kar raha hai...");
        try {
            latch.await(); // Wait karega jab tak latch ka count 0 na ho jaye
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sare workers ka kaam khatam, ab main thread continue karega!");
    }
}