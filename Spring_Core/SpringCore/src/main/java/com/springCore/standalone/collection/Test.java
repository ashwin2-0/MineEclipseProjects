package com.springCore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("Program Started ...!");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springCore/standalone/collection/standaloneCollect.xml");

		Person person = (Person) context.getBean("person");

		// Print standalone list (Friends)
		System.out.println(" standalone list (Friends) :");
		person.getFriends().forEach(friend -> System.out.println("\t• " + friend));
		System.out.println("--------------------------------------------------------------");
		// Print standalone map (Fee Structure Map)
		System.out.println("standalone map (Fee Structure Map)");
		person.getFeeStructure().forEach((key, value) -> System.out.println("\t• " + key + ": " + value));
		System.out.println("--------------------------------------------------------------");
		System.out.println("standalone Properties (Hiberate Properties)");
		person.getHibernateProperties().forEach((key, value) -> System.out.println(key + ": " + value));


	}
}
