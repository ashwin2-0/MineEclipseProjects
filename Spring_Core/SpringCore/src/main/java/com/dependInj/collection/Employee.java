package com.dependInj.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String name;
	private List<Integer> phones;
	private Set<String> address;
	private Map<Integer, String> couses;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, List<Integer> phones, Set<String> address, Map<Integer, String> couses) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.couses = couses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getPhones() {
		return phones;
	}

	public void setPhones(List<Integer> phones) {
		this.phones = phones;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<Integer, String> getCouses() {
		return couses;
	}

	public void setCouses(Map<Integer, String> couses) {
		this.couses = couses;
	}

}
