package src.com.learnWithDurgesh;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo1 {
	public static void main(String[] args) {
		List<Integer> nums = List.of(23,87,48,26,05,37,47,58,24,59);
		Consumer<Integer> printNumber = number -> System.out.print(number);
		nums.stream().forEach(printNumber);;
	}

}
