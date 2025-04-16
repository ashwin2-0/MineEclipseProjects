package src.com.telusko;

public interface Phone {
	void call();
	default void message() {
		System.out.println("Messaging done through Interface");
	}
	static void missCall() {
		System.out.println("Missed Call is done..s");
	}
}
