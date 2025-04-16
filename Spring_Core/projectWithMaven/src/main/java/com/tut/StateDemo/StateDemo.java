package com.tut.StateDemo;

import javax.transaction.Transactional.TxType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {

	public static void main(String[] args) {
		// Hibernate states are as follows
		// Transient state 
		// Persistent State
		// Detached State
		// Removed State
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Student st = new Student();
		st.setId(451);
		st.setName("Ramdas");
		st.setCity("PrayagRaj");
		// we can here it is in transient state
		Session s = factory.openSession();
		s.save(st);
		// persistent state
		// see still persistent state u can change the values
		Transaction tx = s.beginTransaction();
		st.setName("Bhaurao");
		tx.commit();
		s.close();	
		// detached state	
		
		
		
		
		factory.close();
	}
}
