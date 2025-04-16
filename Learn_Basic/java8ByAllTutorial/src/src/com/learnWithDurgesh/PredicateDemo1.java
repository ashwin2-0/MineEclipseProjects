package src.com.learnWithDurgesh;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo1 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Dog", "Cat", "Parrat", "cow", "Fish");
		Predicate<String> lenghtGreateThanThree = word -> word.length() > 3;
		List<String> longWords = words.stream().filter(lenghtGreateThanThree).collect(Collectors.toList());
		longWords.forEach(System.out::println);

	}

}
