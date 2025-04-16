package src.com.learnWithDurgesh;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateConsumerDemo {
	public static void main(String[] args) {
		List<Integer> nums = List.of(23,87,48,26,05,37,47,58,24,59);
		Predicate<Integer> isEven = even -> even % 2 == 0 ;   // this is predicate // boolean value function
		Consumer<Integer> printEven = a -> System.out.println(a);
		nums.stream().filter(isEven).forEach(printEven);
		// same thing we can do in one line also 
		List<Integer> evn = nums.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evn);
				
		// now lest do the operation nnumbers greater than 30
		List<Integer> greater = nums.stream().filter(i-> i>30).collect(Collectors.toList());
		List<Integer> lesser = nums.stream().filter(i-> i<30).collect(Collectors.toList());
		System.out.println(greater);
		System.out.println(lesser);
			        
	}

}
