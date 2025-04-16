package com.spring.stereo.componentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/stereo/componentScan/stereoConfig.xml");
		Student student = (Student) context.getBean("obj", Student.class);
		/*
		 * System.out.println(student.toString());
		 * student.getAddress().forEach(a->System.out.println("City :"+a));
		 * System.out.println("Class is :"+student.getAddress().getClass().getName());
		 */
		System.out.println("hash Code of bean1 :" + student.hashCode());
		Student student2 = (Student) context.getBean("obj", Student.class);
		System.out.println("hash Code of bean2 :" + student2.hashCode());
		System.out.println("-------------------prototype demonstrate----------------------");
		ApplicationContext context2 = new ClassPathXmlApplicationContext(
				"com/spring/stereo/componentScan/stereoConfig.xml");
		Person p1 = (Person) context.getBean("person", Person.class);
		System.out.println(p1.toString());
		System.out.println(" p1 hashCode :"+p1.hashCode());
		Person p2 = (Person) context.getBean("person", Person.class);
		
		System.out.println(" p2 hashCode :"+p2.hashCode());
		

	}
}
