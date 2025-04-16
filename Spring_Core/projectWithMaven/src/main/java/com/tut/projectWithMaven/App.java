package com.tut.projectWithMaven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("My Hibernate Project Started...!");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		// Creating student
		Student st = new Student();
		st.setId(1);
		st.setName("Ashwin");
		st.setCity("Dubai");
		System.out.println(st);

		// creating object of address Class
		Address ad = new Address();
		ad.setCity("Denmark");
		ad.setStreet(42);
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(54);
		// reading image
		FileInputStream img = new FileInputStream("src/main/java/bike.jpg");
		byte[] data = new byte[img.available()];
		ad.setImage(data);

		// Using openSession to manage the session manually
		Session session = factory.openSession();
		Transaction trns = session.beginTransaction();
		session.save(st); // Save the Student entity
		session.save(ad); // save the address entity
		trns.commit(); // Commit the transaction
		session.close(); // Close the session
		System.out.println("Done..");

	}
}
