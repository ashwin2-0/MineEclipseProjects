package com.practise.javaBrains.LambdaBasic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// que : Count  the frequency of each character in a string
public class FrequencyOfEachChar {
	public static void main(String[] args) {
		String input = "ilovejavaTechi";
		Map<String, Long> res = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(res);
	}

}
