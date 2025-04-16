package com.spring.CI;

public class Addition {
	private Integer a;
	private Integer b;

	public Addition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Addition(Integer a, Integer b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Construcor Integer Integer get called");

	}

	public Addition(Double a, Double b) {
		super();
		this.a = a.intValue();
		this.b = b.intValue();
		System.out.println("Construcor Double Double get called");
	}

	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Construcor String String get called");
	}

	public void doSum() {
		System.out.println("Sum is :" + (this.a + this.b));
	}

	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}

}
