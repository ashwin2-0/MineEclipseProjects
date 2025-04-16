package src.com.learnWithDurgesh;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		String str = null;
		String surname ="Ingle";
		Optional<String> strDemo = Optional.ofNullable(str);
		System.out.println(strDemo.orElse(surname));
	}

}
