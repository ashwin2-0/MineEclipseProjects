package com.practise.javaBrains.Random;

class Employee {
	private int id;
	private double salary;

	public Employee(int id, double salary) {
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", salary=" + salary + '}';
	}
}