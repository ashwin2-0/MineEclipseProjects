package com.practise.javaBrains.LambdaBasic;

import java.util.ArrayList;
import java.util.List;

public class ListForEach {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("ankit");
		list.add("mayank");
		list.add("irfan");
		list.add("jai");
		int count = 0;
		list.forEach(

				(n) -> System.out.println("--> " + n));

	}

}
