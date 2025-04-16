package com.practise.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StudenImpl {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Alice", 85.5));
		students.add(new Student("Bob", 92.0));
		students.add(new Student("Charlie", 78.0));
		students.add(new Student("David", 88.5));
		students.add(new Student("Eve", 91.0));
		students.add(new Student("Frank", 74.5));
		students.add(new Student("Grace", 89.0));
		students.add(new Student("Hank", 82.0));
		students.add(new Student("Ivy", 95.0));
		students.add(new Student("Jack", 80.0));
		students.add(new Student("Kathy", 87.5));
		students.add(new Student("Leo", 90.0));
		students.add(new Student("Mona", 76.5));
		students.add(new Student("Nina", 84.0));
		students.add(new Student("Oscar", 93.0));
		students.add(new Student("Paul", 77.5));
		students.add(new Student("Quinn", 86.0));
		students.add(new Student("Rita", 79.0));
		students.add(new Student("Sam", 83.5));
		students.add(new Student("Tina", 88.0));
		Collections.sort(students);
		Stream<Student> st = students.stream();
		st.forEach(System.out::println);
	}

}
