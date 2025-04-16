package src.com.javaTechie;

import java.util.function.Predicate;

public class PredicateDemoWithoutLambda implements Predicate<Integer> {
	public boolean test(Integer a) {
		if(a%2 == 0) {
			return true;
		}else {
			return false;
		}
	}
}
