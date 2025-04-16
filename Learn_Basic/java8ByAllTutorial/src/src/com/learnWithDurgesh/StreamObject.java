package src.com.learnWithDurgesh;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObject {
	public static void main(String[] args) {
		String[] names = {"Ashwin","Deepak","Krishna","poonam","Pratik"};
			
			// creating stream first way 
			Stream<Object> stream = Stream.empty();
			
			
			// creating stream second way 
			Stream<String> stream1 = Stream.of(names).sorted();
			List<String> stream4 = stream1.collect(Collectors.toList());
	        stream4.forEach(System.out::println);

		//	stream1.forEach(System.out::println);
		
			// third way to create stream is by using builder pattern
			Stream<Object> stream3 =  Stream.builder().build();
			
			// how to copy the elememt of stream 1 to stream 3 
			
			Stream<String> nameList =  stream4.stream();
			nameList.forEach(System.out::println);
			
	}

}
