package src.com.telusko;

import java.util.ArrayList;
import java.util.List;

public class MethoRefDemo1 {
	public static void main(String[] args) {
		// Create a list of strings
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Date");
		list.add("Elderberry");

		// Print each element using forEach
		list.forEach(System.out::println);
	}
}
