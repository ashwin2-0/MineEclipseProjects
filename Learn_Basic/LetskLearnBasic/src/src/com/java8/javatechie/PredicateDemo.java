package src.com.java8.javatechie;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo implements Predicate<Integer> {
    @Override
    public boolean test(Integer a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
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
        Predicate<Integer> predicate = new PredicateDemo();
        List<Integer> evenList = new ArrayList<>();
        for (Integer a : numbers) {
            System.out.println(predicate.test(a));

        }
        evenList = numbers.stream().filter((a) -> {
            if (a % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }).toList();
        System.out.println("Array List :"+evenList);

    }
}
