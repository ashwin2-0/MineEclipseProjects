package com.practise.any;

public class Student {
	int id;
	String name = "";

	Student(int id1, String name1) {
		id = id1;
		name = name1;
	}

	void displayInfo() {
		System.out.println("Student id is :" + id + " with name is :" + name);
	}

	public static void main(String[] args) {
		Student st = new Student(12, "Ashwin");
		st.displayInfo();
		Student st1 = new Student(34, "Meghna");
		st1.displayInfo();
	}
}
