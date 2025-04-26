package comparableAndComparatorDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();

		customers.add(new Customer("Alice", 25));
		customers.add(new Customer("Bob", 32));
		customers.add(new Customer("Charlie", 28));
		customers.add(new Customer("David", 40));
		customers.add(new Customer("Eve", 22));
		customers.add(new Customer("Frank", 35));
		customers.add(new Customer("Grace", 27));
		customers.add(new Customer("Hank", 29));
		customers.add(new Customer("Ivy", 31));
		customers.add(new Customer("Jack", 24));
		customers.add(new Customer("Kate", 33));
		customers.add(new Customer("Leo", 30));
		customers.add(new Customer(null, 26));
		customers.add(new Customer("Nina", 38));
		customers.add(new Customer("Oscar", 23));
		customers.add(new Customer("Paul", 36));
		customers.add(new Customer(null, 21));
		customers.add(new Customer("Ruby", 34));
		customers.add(new Customer("Steve", 39));
		customers.add(new Customer("Tina", 20));
		List<Customer> sort = customers.stream().sorted().collect(Collectors.toList());
		for (Customer Customer : sort) {
			System.out.println(Customer);
		}
	}
}

class Customer implements Comparable<Customer> {
	private String name;
	private int age;

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Customer o) {
		if (this.name == null && o.name == null)
			return 0;
		if (this.name == null)
			return -1;
		if (o.name == null)
			return 1;
		return this.name.compareTo(o.name);
	}
}
