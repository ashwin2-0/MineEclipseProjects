package com.sql.nativeQuery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.tut.StateDemo.Student;

public class SQLExample {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		String q = "select * from StudentState"; // this is sql query
		NativeQuery nq = session.createSQLQuery(q);
		List<Object[]> list = nq.getResultList();
		list.stream()
				.forEach((a) -> System.out.print("Student Id: " + a[0] + ", Name: " + a[1] + ", City: " + a[2] + "\n"));
		session.close();
		factory.close();
	}

}
