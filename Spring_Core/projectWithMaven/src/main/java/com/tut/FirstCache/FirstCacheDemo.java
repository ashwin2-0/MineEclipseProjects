package com.tut.FirstCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.StateDemo.Student;



public class FirstCacheDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		// now first level cache are by default enabled

		Student student1 = session.get(Student.class, 105);
		// Transaction tx = session.beginTransaction();
		System.out.println(student1.toString());
		System.out.println("-----------------working on some task------------------------");
		Student student2 = session.get(Student.class, 105);
		System.out.println("session.contains(student1) :"+session.contains(student1));
		System.out.println("-----------------Hence First level Cache works------------------------");
		System.out.println(student2.toString());
		// tx.commit();
		session.close();
		factory.close();
		// now for another session another query will get fired

	}
}
