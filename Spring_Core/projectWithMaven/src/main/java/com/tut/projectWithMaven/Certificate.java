package com.tut.projectWithMaven;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	private String course;
	private int durationMonth;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(String course, int durationMonth) {
		super();
		this.course = course;
		this.durationMonth = durationMonth;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getDurationMonth() {
		return durationMonth;
	}

	public void setDurationMonth(int durationMonth) {
		this.durationMonth = durationMonth;
	}

	@Override
	public String toString() {
		return "Certificate [course=" + course + ", durationMonth=" + durationMonth + "]";
	}

}
