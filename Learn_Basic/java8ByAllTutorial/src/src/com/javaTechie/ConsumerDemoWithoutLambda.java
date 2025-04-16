package src.com.javaTechie;

import java.util.function.Consumer;

public class ConsumerDemoWithoutLambda implements Consumer<Integer> {

	@Override
	public void accept(Integer a) {
		System.out.println("Inside consumer :" + a);
	}

	public static void main(String[] args) {
		ConsumerDemoWithoutLambda abcd = new ConsumerDemoWithoutLambda();
		abcd.accept(19);
	}

}
