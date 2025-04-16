package com.spring.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	
	@Autowired
	@Qualifier(value="temp2")
	private Address address;

	public Employee() {
		super();
		System.out.println("Default Constructor from Employee getting called");
	}
	//@Autowired
	public Employee(Address address) {
		System.out.println("Constructor from employee getting called");
	
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Setting Address from Employee Class..");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address.city=" + address.getCity() + " ,address.street :" + address.getStreet() + "]";
	}
	
}
