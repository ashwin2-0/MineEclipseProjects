package src.com.learnWithDurgesh;

import java.util.Date;

public class Stuff {
	public static void doStuff() {
		System.out.println("Hello , Doing stuff");
		System.out.println("Writing in second line");
		Date a = new Date();
		System.out.println(a);

	}

	public static void threadtask() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(i+" :"+Thread.currentThread().getName());
				Thread.sleep(500);
			}
			Thread.currentThread().yield();
		} catch (InterruptedException e) {
			Thread.interrupted();
		}

	}
	
	public  void nonStaticMethod() {
		try {
			for (int i = 32; i < 68; i++) {
				System.out.println(i+" :"+Thread.currentThread().getName());
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			Thread.interrupted();
		}

	}
}
