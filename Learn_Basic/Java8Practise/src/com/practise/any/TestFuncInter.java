package com.practise.any;

import java.util.ArrayList;

public class TestFuncInter {
	public static void main(String[] args) {
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);
		System.out.println("Even Elements :");
		arrL.forEach(i -> {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		});

	}

}
