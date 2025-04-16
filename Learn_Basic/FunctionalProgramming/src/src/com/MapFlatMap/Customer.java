package src.com.MapFlatMap;

import java.util.List;

public class Customer {
	private Integer CustomerId;
	private String name;
	private String email;
	private List<Long> phoneNumbers;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer customerId, String name, String email, List<Long> phoneNumbers) {
		super();
		CustomerId = customerId;
		this.name = name;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
	}

	public Integer getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(Integer customerId) {
		CustomerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Long> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", name=" + name + ", email=" + email + ", phoneNumbers="
				+ phoneNumbers + "]";
	}

}
