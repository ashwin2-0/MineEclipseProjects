package com.spring.auto.wireTypes;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestByTypeName {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/auto/wireTypes/autoConfig.xml");

		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.toString());

		context.registerShutdownHook();
	}
}
