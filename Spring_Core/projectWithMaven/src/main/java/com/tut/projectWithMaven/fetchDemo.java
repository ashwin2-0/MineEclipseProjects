package com.tut.projectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetchDemo {
	public static void main(String[] args) {
		System.out.println("My Hibernate Project Started...!");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Student student = (Student) session.get(Student.class, 1);
		Student student1 = (Student) session.load(Student.class, 1);
		//	Student student1 = (Student) session.get(Student.class, 1);
		Address address = (Address) session.get(Address.class, 2);
		System.out.println("Printing Student Object");
		System.out.println(student1);
		System.out.println("Printing Address Object");
		// System.out.println(address);
		session.close();
		factory.close();

	}
}
