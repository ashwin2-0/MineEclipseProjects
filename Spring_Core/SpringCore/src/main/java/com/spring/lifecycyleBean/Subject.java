package com.spring.lifecycyleBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Subject {
	private String subject;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(String subject) {
		super();
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Subject [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting method like INIT Method in @PostConstruct Annoted method");
		
	}
	@PreDestroy	
	public void end() {
		System.out.println("Ending method like destroy Method in @PreDestroy method");
		
	}

}
