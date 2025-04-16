package com.springCore;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class Student {

	private Integer student_id;
	private String student_name;
	private String student_city;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer student_id, String student_name, String student_city) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_city = student_city;
	}

	public Integer getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Integer student_id) {
		System.out.println("student_id setter get called");
		this.student_id = student_id;
	}

	public String getStudent_name() {

		return student_name;
	}

	public void setStudent_name(String student_name) {
		System.out.println("student_name setter get called");
		this.student_name = student_name;
	}

	public String getStudent_city() {
		return student_city;
	}

	public void setStudent_city(String student_city) {
		System.out.println("student_city setter get called");
		this.student_city = student_city;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_city=" + student_city
				+ "]";
	}

}
