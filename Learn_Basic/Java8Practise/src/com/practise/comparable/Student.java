package com.practise.comparable;

public class Student implements Comparable<Student> {
	private String name;
	private double grade;

	Student(String n, double g) {
		this.name = n;
		this.grade = g;

	}

	@Override
	public int compareTo(Student st) {
		
		return Double.compare(this.grade, st.grade);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}
	
	

}
