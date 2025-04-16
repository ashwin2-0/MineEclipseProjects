package com.practise.any;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterAndCollectTest {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(943, 157, 712, 532, 805, 562, 798, 357, 719, 549, 783, 853, 354, 520, 422,
				602, 529, 666, 543, 711, 377, 197, 804, 762, 490, 981, 882, 212, 287, 936);
		// List<Integer> evenList = numList.stream().filter(i -> i % 2 ==
		// 0).collect(Collectors.toList());

		Map<Boolean, List<Integer>> numbers = numList.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
		List<Integer> evenList = numbers.get(true);
		List<Integer> oddList = numbers.get(false);
		System.out.println(evenList);
		System.out.println(oddList);

	}
}
