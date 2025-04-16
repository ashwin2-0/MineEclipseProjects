package com.dependInj.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTest {
	public static void main(String[] args) {
		System.out.println("Program Started ...!");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Employee employee = (Employee) context.getBean("employee");

		System.out.println("Name: " + employee.getName());

		System.out.println("Phones:");
		employee.getPhones().forEach(phone -> System.out.println("\t• " + phone));

		System.out.println("Addresses:");
		employee.getAddress().forEach(address -> System.out.println("\t• " + address));

		System.out.println("Courses:");
		employee.getCouses().forEach((key, value) -> System.out.println("\t• " + key + " : " + value));
		
	}
}
