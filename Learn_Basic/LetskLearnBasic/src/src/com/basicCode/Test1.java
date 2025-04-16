package src.com.basicCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> lis = Arrays.asList(1,3,2,4,3,1,2);
  //      List<Integer> sortedList = lis.stream().distinct().sorted().toList();
        List<Integer> sortedList = lis.stream().distinct().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Sorted List :"+sortedList);

    }
}
