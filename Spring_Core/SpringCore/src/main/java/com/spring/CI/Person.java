package com.spring.CI;

public class Person {
	private String name;
	private Integer personId;
	private Certi certi  ;

	public Person(String name, Integer personId,Certi certi) {
		this.name = name;
		this.personId = personId;
		this.certi=certi;
		System.out.println("Person Constructor get called..");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certi.name=" + certi.toString()+ "]";
	}
	

	

	

}
