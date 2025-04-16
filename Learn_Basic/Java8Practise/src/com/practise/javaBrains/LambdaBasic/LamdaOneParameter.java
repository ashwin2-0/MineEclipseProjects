package com.practise.javaBrains.LambdaBasic;

interface Hello {
	public void hi(String name);
}

public class LamdaOneParameter {
	public static void main(String[] args) {
		Hello h = (name) -> {
			System.out.println("Hello ...Handsome.." + name);
		};

		h.hi("Ashwin");
	}

}
