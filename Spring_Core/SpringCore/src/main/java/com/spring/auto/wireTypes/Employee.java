package com.spring.auto.wireTypes;

public class Employee {
	private Address address;

	public Employee() {
		super();
		System.out.println("Default Constructor from Employee getting called");
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address.city=" + address.getCity() + " ,address.street :" + address.getStreet() + "]";
	}
	
}
