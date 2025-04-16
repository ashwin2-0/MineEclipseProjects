package src.com.MapFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMapDemo {
	public static void main(String[] args) {
		List<Customer> list = CustomerDatabase.getAllCustomer();
		// get all Customer and add all email it into list
		// here all the Customer have one email id ,hence we are able to do this , we
		// called it one to on mapping
		List<String> emailList = list.stream().map(a -> a.getEmail()).collect(Collectors.toList());
		emailList.forEach(System.out::println);
		//  a.getPhoneNumbers() see this is one to many scenario hence  map will not work here , used flatmap then 
		List<List<Long>> phnolist = list.stream().map(a -> a.getPhoneNumbers()).collect(Collectors.toList());
		System.out.println("Printing the list of phone number");
		System.out.println(phnolist);
		System.out.println("Correct way of printing list of phonNumber");
		// Note : please understand that flatMap accepts the stream of stream
		List<Long> flatMapList = list.stream().flatMap(a -> a.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println(flatMapList);
	}
}
