package src.com.java8.javatechie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList = DatabseEmployee.getEmployye();
        employeeList.forEach(System.out::println);
        // now lets sort the employee based on there salary
        System.out.println("--------------------After Sorting---------------------------------");
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.getSalary(), o2.getSalary());
            }
        });
        System.out.println(employeeList);
        System.out.println("--------------------After Sorting by lambda---------------------------------");
     //   Collections.sort(employeeList, (a, b) -> Double.compare(b.getSalary(), a.getSalary()));
    //    Collections.sort(employeeList, Comparator.comparingDouble(Employee::getSalary));    --> can also be written as
      //  System.out.println(employeeList);
     //   employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);     -- ascending order
     //   employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);  // in descending order
        employeeList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

    }
}
