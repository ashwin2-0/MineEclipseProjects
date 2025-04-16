package com.spring.stereo.componentScan;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj")
//@Scope("prototype")
public class Student {
	@Value("Raunak Tiwari")
	private String student_name;
	@Value("Indore")
	private String student_city;
	@Value("#{listOfCities}")
	private List<String> address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String student_name, String student_city, List<String> address) {
		super();
		this.student_name = student_name;
		this.student_city = student_city;
		this.address = address;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_city() {
		return student_city;
	}

	public void setStudent_city(String student_city) {
		this.student_city = student_city;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [student_name=" + student_name + ", student_city=" + student_city + ", address=" + address
				+ "]";
	}

}
