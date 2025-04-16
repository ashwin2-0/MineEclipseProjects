package com.tut.map2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Employee e1 = new Employee();
		e1.setEid(342);
		e1.setEmployeeName("RamaKrishna");

		Employee e2 = new Employee();
		e2.setEid(343);
		e2.setEmployeeName("Sadashiv");

		Project p1 = new Project();
		p1.setPid(888);
		p1.setProjectName("Burdwan Bank Ltd");

		Project p2 = new Project();
		p2.setPid(999);
		p2.setProjectName("Malayan Bank Philipins");
		
		List<Employee> empList = new ArrayList<Employee>();
		List<Project> projectList = new ArrayList<Project>();
		empList.add(e1);
		empList.add(e2);
		projectList.add(p1);
		projectList.add(p2);
		e1.setProjects(projectList);

		p2.setEmployees(empList);

		Session session = factory.openSession();
		session.save(e1);
		session.save(p2);
		session.save(e2);
		session.save(p1);
		Transaction tx = session.beginTransaction();
		tx.commit();
		session.close();
		factory.close();

	}

}
