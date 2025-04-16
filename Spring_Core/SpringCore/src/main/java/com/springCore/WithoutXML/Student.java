package com.springCore.WithoutXML;

import org.springframework.stereotype.Component;

//@Component("studentBean")
public class Student {
	
	private Samosa samosa ;
	
	
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}



	public void studying() {
		this.samosa.priceMethod();
		System.out.println("Student is studying...");
	}

}
