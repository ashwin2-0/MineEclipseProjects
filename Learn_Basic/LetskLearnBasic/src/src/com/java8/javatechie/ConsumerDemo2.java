package src.com.java8.javatechie;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerDemo2 {


    public static void main(String[] args) {
        ConsumerDemo2 cd = new ConsumerDemo2();
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Manually add 20 random two-digit numbers
        numbers.add(23);
        numbers.add(56);
        numbers.add(78);
        numbers.add(45);
        numbers.add(12);
        numbers.add(67);
        numbers.add(89);
        numbers.add(34);
        numbers.add(90);
        numbers.add(11);
        numbers.add(58);
        numbers.add(63);
        numbers.add(74);
        numbers.add(29);
        numbers.add(81);
        numbers.add(16);
        numbers.add(39);
        numbers.add(47);
        numbers.add(88);
        numbers.add(92);
        Consumer<Integer> ans = (t) -> System.out.print("\nPrinting by consumer :"+t);
        for(Integer i :numbers){
            ans.accept(i);
        }
       // numbers.forEach(i -> System.out.println("Printing  by lambda:" + i));
    }

}
