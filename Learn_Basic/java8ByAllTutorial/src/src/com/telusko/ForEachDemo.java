package src.com.telusko;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
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
		// now here there are 2 ways to print this by using loops
		for (int i : list1) { // this is called as External loop
			System.out.println(i);
		}
		// now lets try using for Each loop'
		System.out.println("Priting values by usig for each from java 8");
		list1.forEach(i -> System.out.println(i));
	}
}
