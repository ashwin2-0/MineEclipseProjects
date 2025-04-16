package src.com.javaTechie;

@FunctionalInterface
interface Calculator {
	void switchOn();

}

public class CalculatorImpl {
	public static void main(String[] args) {

		Calculator method = () -> System.out.println("Bulb Switch On");
		method.switchOn();
	}

}
