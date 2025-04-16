package com.spring.lifecycyleBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/lifecycyleBean/beanLife.xml");
		/*
		 * Employee employee = (Employee) context.getBean("employee");
		 * System.out.println(employee.toString()); // context.registerShutdownHook();
		 * System.out.println("----------------for Pepsi------------------------");
		 * Pepsi pepsi = (Pepsi) context.getBean("pepsi");
		 * System.out.println(pepsi.toString()); // context.registerShutdownHook();
		 */		System.out.println("----------------FOR Subject-----------------------");
		Subject subject = (Subject) context.getBean("subject");
		System.out.println(subject.toString());
		context.registerShutdownHook();
	}
}
