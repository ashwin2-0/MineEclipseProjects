package com.practise.random.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
	public static void main(String[] args) {
		// task 1 - this class is written to practise the all java 8 feature one by one

		List<Integer> num = Arrays.asList(34, 45, 2, 456, 4, 667, 23, 78, 35, 23, 678, 233, 6, 764, 244, 556);

		List<Integer> squareList = num.stream().map(i -> i * i).collect(Collectors.toList());
		// squareList.forEach(i -> System.out.println(1 * i));

		// task 2 - Create a functional interface called MathOperation with a method
		// that takes
		// two integers and returns their sum.
		@FunctionalInterface
		interface MathOperation {
			int operate(int a, int b);
		}

		MathOperation operation = (int a, int b) -> a + b;

		int res = operation.operate(34, 54);
		// System.out.println("Sum is "+ res);

		// task 3 - Create a list of integers and use the Stream API to filter out even
		// numbers.

		List<Integer> evenList = num.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		evenList.forEach(i -> System.out.println(i));

		// task 4 - Use the Stream API to find the sum of all integers in the list.

		int sum = 0;
		sum = num.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum is " + sum);

	}
}
