package src.com.java8.javatechie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortingListByLambda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
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
        // Collections.sort(numbers);        -- ascending Order
        //   Collections.reverse(numbers);    -- Descending Order
        //   numbers.stream().sorted();     -- ascending order
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}
