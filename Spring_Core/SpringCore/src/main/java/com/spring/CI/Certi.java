package com.spring.CI;

public class Certi {
	private String name;

	public Certi(String name) {
		super();
		this.name = name;
		System.out.println("Certi Constructor get called..");
	}

	@Override
	public String toString() {
		return "Certi [name=" + name + "]";
	}
	

}
