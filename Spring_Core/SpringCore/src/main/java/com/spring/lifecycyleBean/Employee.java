package com.spring.lifecycyleBean;

public class Employee {
	private Integer empId;
	private String empName;

	// Default constructor
	public Employee() {
		super();
	}

	// Fully parameterized constructor
	public Employee(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	// Getter for empId
	public Integer getEmpId() {
		return empId;
	}

	// Setter for empId
	public void setEmpId(Integer empId) {
		System.out.println("emp Id Setter get called");
		this.empId = empId;
	}

	// Getter for empName
	public String getEmpName() {
		return empName;
	}

	// Setter for empName
	public void setEmpName(String empName) {
		System.out.println("emp Name Setter get called");
		this.empName = empName;
	}

	// toString method
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	public void initMethod() {
		System.out.println("Inside Init Method");
	}

	public void destroyMethod() {
		System.out.println("Inside Destroy Method");
	}
}
