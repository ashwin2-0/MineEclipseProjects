package com.spring.lifecycyleBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean ,DisposableBean {
	private double price;

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Defining init  method in afterPropertySet method");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Defining Destroy  method in Destroy  method");
		
	}

}
