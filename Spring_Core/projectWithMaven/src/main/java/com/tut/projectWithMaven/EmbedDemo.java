package com.tut.projectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {
	public static void main(String[] args) {
		System.out.println("My Hibernate Project Started...!");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Student student1 = new Student();
		student1.setId(78);
		student1.setCity("Amritsar");
		student1.setName("Raman Tiwari");
		student1.setCerti(new Certificate("Hibernate Course",5));
		Student student2 = new Student();
		student2.setId(82);
		student2.setCity("Ludhiyana");
		student2.setName("Pankaj Tiwari");
		student2.setCerti(new Certificate("Spring Boot",6));
		
		Transaction trans = session.beginTransaction();
		session.save(student1);
		session.save(student2);
		trans.commit();
		session.close();
		System.out.println("Done..!");
		
		
	}

}
