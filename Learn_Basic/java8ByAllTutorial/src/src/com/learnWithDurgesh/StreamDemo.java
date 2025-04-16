package src.com.learnWithDurgesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(23);
		list1.add(82);
		list1.add(28);
		list1.add(83);
		list1.add(84);
		list1.add(63);
		list1.add(47);
		list1.add(49);
		System.out.println(list1.toString());
		Collections.addAll(list1, 34, 25, 54);
		System.out.println(list1.toString());
		List<Integer> evenList = new ArrayList<Integer>();
		for (Integer a : list1) {
			if (a % 2 == 0) {
				evenList.add(a);
			}

		}
		System.out.println("Even list :"+evenList);
		
		// now same can be done using Stream API

	}

}
