package com.practise.javaBrains.Random;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DescOrderSalary {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, 50000));
		employees.add(new Employee(2, 60000));
		employees.add(new Employee(3, 45000));
		employees.add(new Employee(4, 75000));
		List<Employee> emp = employees.stream()
				.sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
				.limit(3).collect(Collectors.toList());
			//	.skip(3)
				//.collect(Collectors.toList());
		for (Employee e : emp) {
			System.out.println(e.toString());
		}

	}

}
