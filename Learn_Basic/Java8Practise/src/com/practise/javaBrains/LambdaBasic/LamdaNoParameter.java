package com.practise.javaBrains.LambdaBasic;

interface Tech {
	public void say();
}

public class LamdaNoParameter {
	public static void main(String[] args) {
		Tech t = ()->{
			System.out.println("Hello , say Something ");
		};
		t.say();
	}

}
