package com.spring.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCI {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/CI/ciConfig.xml");
		Person obj = (Person) context.getBean("person");
		System.out.println(obj.toString());
		System.out.println("----------------In Addition Now---------------------------------");
		Addition obj2 = (Addition) context.getBean("addition");
		System.out.println(obj2.toString());
		obj2.doSum();

	}
}
