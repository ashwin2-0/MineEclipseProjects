package src.com.java8.javatechie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () ->  "Supplier Calling Method" ;
        System.out.println(supplier.get());
        List<String> a = Arrays.asList("abcd","pwr","stu");

        System.out.println(a.stream().findAny().orElseGet(supplier));



    }
}
