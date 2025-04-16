package src.com.learnWithDurgesh;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMethodDemo {
	public static void main(String[] args) {
		// filter
		// filter will take a predicate - basically a boolean value function -> if it gives true
		// then it will take that element otherwise leave it 
		
		
		
		// map(function) = it will return value
		// we can perform operation each element
		
		// lets demonstrates
		
		 List<String> cities = List.of(
		            "New York", "Los Angeles", "Chicago", "Houston", "Phoenix",
		            "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose",
		            "Austin", "Jacksonville", "Fort Worth", "Columbus", "Charlotte",
		            "San Francisco", "Indianapolis", "Seattle", "Denver", "Washington",
		            "Boston", "El Paso", "Nashville", "Detroit", "Oklahoma City",
		            "Portland", "Las Vegas", "Memphis", "Louisville", "Baltimore"
		        );
		List<String> city =  cities.stream().filter(a->a.startsWith("P")).collect(Collectors.toList());
		city.forEach(System.out::println);
		
		// lets demonstrate map
		 Random random = new Random();
	        
	        // Generate a list of 30 random two-digit integers
	        List<Integer> randomTwoDigitNumbers = IntStream.range(0, 30)
	                                                       .map(i -> 10 + random.nextInt(90))
	                                                       .boxed()
	                                                       .collect(Collectors.toList());
	        
	     // System.out.println(randomTwoDigitNumbers);
	      randomTwoDigitNumbers.stream().sorted().forEach(System.out::println);
	      List<Integer> sqrNum = randomTwoDigitNumbers.stream().sorted().map(i->i*i).collect(Collectors.toList());
	      sqrNum.forEach(System.out::println);
	      Integer a = randomTwoDigitNumbers.stream().min((x,y) -> x.compareTo(y)).get();
	      System.out.println("Min:"+a);
	      Integer b = randomTwoDigitNumbers.stream().max((x,y) -> x.compareTo(y)).get();
	      System.out.println("Max:"+b);
	        
		 
	}

}
