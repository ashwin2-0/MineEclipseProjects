package com.tut.SecondCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.StateDemo.Student;

public class SecondCacheDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println("-----------------In Session 1------------------------");
		Session session1 = factory.openSession();
		Student student1 = session1.get(Student.class, 105);
		System.out.println(student1.toString());
		session1.close();
		
		System.out.println("-----------------In Session 2------------------------");
		Session session2 = factory.openSession();
		Student student2 = session2.get(Student.class, 105);
		System.out.println(student2.toString());
		System.out.println("-----------------Closing Session------------------------");
		session2.close();

		factory.close();
		// now for another session another query will get fired
	}
}
