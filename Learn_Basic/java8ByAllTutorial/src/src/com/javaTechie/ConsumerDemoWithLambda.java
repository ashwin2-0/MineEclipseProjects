package src.com.javaTechie;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemoWithLambda {
	public static void main(String[] args) {
		Consumer<String> cons = (a) -> System.out.println("Name is :"+a);
		cons.accept("Ashwin");
		Consumer<Integer> intCons = (a) -> System.out.println("Printing :"+a);
		List<Integer> list = Arrays.asList(12,47,98,35,39,96,46,76);
		list.stream().forEach(intCons);
	}

}
