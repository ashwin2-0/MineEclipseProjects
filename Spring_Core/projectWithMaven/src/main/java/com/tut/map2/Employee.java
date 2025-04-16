package com.tut.map2;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int eid;
	@Column(name = "employee_name")
	private String employeeName;
	@ManyToMany // we can change the name of created joint table by
				// @JoinTable(name="jointKetTable")
	@JoinTable(name = "jointKetTable", joinColumns = { @JoinColumn(name = "eid") }, inverseJoinColumns = {
			@JoinColumn(name = "pid") })
	private List<Project> projects;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String employeeName, List<Project> projects) {
		super();
		this.eid = eid;
		this.employeeName = employeeName;
		this.projects = projects;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}
