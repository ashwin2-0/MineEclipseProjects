package src.com.myTest.ExecutorFramework;

public class MainDemo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[9];
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            threads[i - 1] = new Thread(
                    () -> {
                        int result = factorial(finalI);
                        System.out.println(result);
                    }

            );
            threads[i - 1].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Total time :" + (System.currentTimeMillis() - startTime));
    }

    public static int factorial(int a) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }
}
