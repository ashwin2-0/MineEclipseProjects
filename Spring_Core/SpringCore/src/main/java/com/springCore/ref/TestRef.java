package com.springCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/ref/refConfig.xml");
		A a = (A) context.getBean("aRef");
		System.out.println("Value of x from A Object :"+a.getX());
		System.out.println("Value of y from B Object :"+a.getObject().getY());
	}

}