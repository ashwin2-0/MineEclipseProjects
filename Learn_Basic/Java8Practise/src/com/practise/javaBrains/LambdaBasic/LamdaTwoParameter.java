package com.practise.javaBrains.LambdaBasic;

interface Addition {
	public int sum(int a, int b, int c);
}

public class LamdaTwoParameter {
	public static void main(String[] args) {
		Addition add = (a, b, c) -> {
			return a + b + c;
		};
		int res = add.sum(34, 28, 46);
		System.out.println("Addition is :" + res);

	}
}
