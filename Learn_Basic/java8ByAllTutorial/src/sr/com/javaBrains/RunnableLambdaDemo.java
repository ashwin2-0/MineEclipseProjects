package sr.com.javaBrains;

public class RunnableLambdaDemo {

	public static void main(String[] args) {
		Runnable run = new Runnable() {

			@Override
			public void run() {
				System.out.println("Running Lambda in Run Method.");
			}
		};
		Thread th = new Thread(run);
		th.start();

		// now lets try to run the same using lambda functional interface

		Thread ex = new Thread(() -> System.out.println("Running Lambda in lamda Method."));
		ex.run();
	}

}
