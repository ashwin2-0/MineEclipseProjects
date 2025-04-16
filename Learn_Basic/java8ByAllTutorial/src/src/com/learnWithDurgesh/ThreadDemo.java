package src.com.learnWithDurgesh;

public class ThreadDemo {
	// we can create thread using lambda also // see below code
	public static void main(String[] args) {
		Runnable runnable = () -> {
			try {
				for (int i = 0; i <= 10; i++) {
					System.out.println("for loop running :" + i + " by :" + Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				System.out.println("Thread got Interrupted");
				Thread.interrupted();
			}

		};
		Thread th = new Thread(runnable);
		th.setName("Ashwin");
		th.start();
	}
}
