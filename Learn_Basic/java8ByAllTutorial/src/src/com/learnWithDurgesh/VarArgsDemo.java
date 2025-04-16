package src.com.learnWithDurgesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VarArgsDemo {		
	public static void main(String[] args) {
	    // Calling the method with multiple arguments
	    List<String> list = createList("Apple", "Banana", "Cherry");
	    System.out.println(list); // Output: [Apple, Banana, Cherry]

	    // Calling the method with a single argument
	    List<String> singleItemList = createList("Apple");
	    System.out.println(singleItemList); // Output: [Apple]

	    // Calling the method with no arguments
	    List<String> emptyList = createList();
	    System.out.println(emptyList); // Output: []
	}
	public static List<String> createList(String... elements) {
	    List<String> list = new ArrayList<>();
	    Collections.addAll(list, elements);
	    return list;
	}
	


}

