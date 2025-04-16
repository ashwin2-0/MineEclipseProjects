package com.practise.javaBrains.LambdaBasic;

interface Demo {
	public void draw();
}

public class WithouLambda {
	public static void main(String[] args) {
		int width = 10;
		Demo m = new Demo() {

			@Override
			public void draw() {
				System.out.println("Demo Called :"+width);

			}
		};
		
		m.draw();

	}
}
