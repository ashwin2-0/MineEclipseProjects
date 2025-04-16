package com.spring.stereo.componentScan;

public class Person {
	private String name;
	private Integer personId;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, Integer personId) {
		super();
		this.name = name;
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + "]";
	}

}
