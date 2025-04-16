package src.com.java8.javatechie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaxServiceEmployee {
    public static void main(String[] args) {
        List<Employee> taxEligible = new ArrayList<>();
        //   DatabseEmployee.getEmployye().stream().filter(a->a.getSalary()>50000).forEach(System.out::println);
        taxEligible = DatabseEmployee.getEmployye().stream().filter(a -> a.getSalary() > 60000).toList();
        System.out.println("Tax Eligible :");
         taxEligible.stream().forEach(System.out::println);
       // taxEligible.forEach(Employee::toString);
    }
}
