package src.com.java8.javatechie;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("Java");
        words.add("Programming");
        words.add("ArrayList");
        Consumer<String> printStr = (a) -> System.out.println(a);
        words.forEach(printStr);
        System.out.println("Another example");
        Map<Integer, String> dataMap = new HashMap<>();

        // Insert 20 entries into the Map
        dataMap.put(1, "Apple");
        dataMap.put(2, "Banana");
        dataMap.put(3, "Cherry");
        dataMap.put(4, "Date");
        dataMap.put(5, "Elderberry");
        dataMap.put(6, "Fig");
        dataMap.put(7, "Grape");
        dataMap.put(8, "Honeydew");
        dataMap.put(9, "Indian Fig");
        dataMap.put(10, "Jackfruit");
        dataMap.put(11, "Kiwi");
        dataMap.put(12, "Lemon");
        dataMap.put(13, "Mango");
        dataMap.put(14, "Nectarine");
        dataMap.put(15, "Orange");
        dataMap.put(16, "Papaya");
        dataMap.put(17, "Quince");
        dataMap.put(18, "Raspberry");
        dataMap.put(19, "Strawberry");
        dataMap.put(20, "Tomato");
        // dataMap.forEach((key, val) -> System.out.println("key :" + key + " ,value :" + val));
        dataMap.entrySet().stream().forEach((key) -> System.out.println("map :" + key));
        System.out.println("-------------------------starts with some character--------------------------------------------------");
        dataMap.entrySet().stream().filter(a -> a.getValue().startsWith("R")).forEach(System.out::println);
        System.out.println("-------------------------odd key printing--------------------------------------------------");
        dataMap.entrySet().stream().filter(a -> a.getKey() % 2 != 0).forEach(System.out::println);

    }
}
