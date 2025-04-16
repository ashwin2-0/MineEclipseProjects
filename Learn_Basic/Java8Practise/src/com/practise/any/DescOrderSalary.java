package com.practise.any;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DescOrderSalary {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, 50000));
		employees.add(new Employee(2, 60000));
		employees.add(new Employee(3, 45000));
		employees.add(new Employee(4, 75000));
		employees.add(new Employee(2, 67000));
		employees.add(new Employee(3, 85000));
		employees.add(new Employee(4, 78000));
		Optional<Employee> optional = employees.stream().max((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()));

	}

}
