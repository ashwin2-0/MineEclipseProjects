package com.tut.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tut.StateDemo.Student;

public class HQLPagination {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Query q = session.createQuery("from Student");
		// implementing pagination using Hibernate
		q.setFirstResult(6);
		q.setMaxResults(15);
		List<Student> list = q.getResultList();
		list.stream().forEach((a) -> System.out
				.print("Student Id:" + a.getId() + ",Name:" + a.getName() + ",City:" + a.getCity() + "\n"));

		session.close();
		factory.close();

	}
}
