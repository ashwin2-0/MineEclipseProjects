package src.com.telusko;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class ConsumerImpl implements Consumer<Integer> {
	public void accept(Integer a) {
		System.out.println(a);
	}
}

public class ConsumerDemo {
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
		Consumer cons = new ConsumerImpl();
		list1.forEach(cons);
	}

}
