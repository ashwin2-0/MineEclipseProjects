package com.springCore.ref;

public class A {
	private Integer x;
	private B object;

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	public A(Integer x, B object) {
		super();
		this.x = x;
		this.object = object;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public B getObject() {
		return object;
	}

	public void setObject(B object) {
		this.object = object;
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", object=" + object + "]";
	}

}
