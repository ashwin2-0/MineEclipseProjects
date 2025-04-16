package com.practise.javaBrains.LambdaBasic;

interface Demo2 {

	public void draw();
}

public class LambdaDemo {
	public static void main(String[] args) {
		int e = 100;
		Demo2 d2  = () ->{
			System.out.println("Demo 2 calling : "+e);
		};
		d2.draw();
	}
	
}
