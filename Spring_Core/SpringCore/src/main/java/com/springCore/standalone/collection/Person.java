package com.springCore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String, Integer> feeStructure;
	private Properties hibernateProperties;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(List<String> friends) {
		super();
		this.friends = friends;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	public Properties getHibernateProperties() {
		return hibernateProperties;
	}

	public void setHibernateProperties(Properties hibernateProperties) {
		this.hibernateProperties = hibernateProperties;
	}

}
