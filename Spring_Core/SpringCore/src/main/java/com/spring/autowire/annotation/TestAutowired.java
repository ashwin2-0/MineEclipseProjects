package com.spring.autowire.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowired {
	public static void main(String[] args) {
		//	see you can use Autowired in Class variable , on Setter method of that class variable 
		// which u wanted to inject also you can use this on constructor also ,[please refer this example
		//
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/autowire/annotation/autowired.xml");

		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.toString());

		context.registerShutdownHook();
	}
}
