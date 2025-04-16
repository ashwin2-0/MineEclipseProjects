package com.tut.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.StateDemo.Student;

public class HQLExample {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		// syntax
		// String query = "from Student where id=450"; or else u can put that value from
		// user also
		String query = "from Student s where s.id=:x and s.name=:y";

		Query q = session.createQuery(query);
		q.setParameter("x", 125);
		q.setParameter("y", "sunil");
		// Single result - unique
		// multiple - list
		List<Student> list = q.list();
		for (Student student : list) {
			System.out.println("ID :" + student.getId() + " ,NAME :" + student.getName());
		}
		// ----------------delete----------------------------------------------
		Transaction tx = session.beginTransaction();
		// now lets write code for delete
		Query q2 = session.createQuery("delete from Student s where city=:x");
		q2.setParameter("x", "gurgaon");
		Integer n = q2.executeUpdate();
		System.out.println("Deleted :" + n);

		// ------------------------------update----------------------------------------
		// now lets write code for update
		Query q3 = session.createQuery("update Student s set s.city=:x where s.id=:r");
		q3.setParameter("x", "Jalgaon");
		q3.setParameter("r", 123);
		Integer w = q3.executeUpdate();
		System.out.println("Update  :" + w);
		// ------------------------------Join Query- One to May
		// Required----------------------------------------
		String hqlJoinQuery = "select q.questionId, q.question, a.answer from Question q inner join q.answers a";
		Query q4 = session.createQuery(hqlJoinQuery);
        System.out.println("Inner Join Result  :");

		List<Object[]> res = q4.getResultList();
		for (Object[] arr : res) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("Inner Join Result  :");

		tx.commit();

		session.close();
		factory.close();

	}
}
