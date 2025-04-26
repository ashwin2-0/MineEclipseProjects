# 100 Java 8 Interview Questions and Solutions for 4-Year Experienced Java Developers

## Lambda Expressions (20 Questions)

1. **What are lambda expressions, and how do they improve code readability?**
   - **Explanation**: Lambda expressions provide a concise way to represent anonymous functions, enabling functional programming in Java.
   - **Code**:
     ```java
     import java.util.Arrays;
     import java.util.List;

     public class Main {
         public static void main(String[] args) {
             List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
             // Lambda to print each name
             names.forEach(name -> System.out.println(name));
         }
     }
     ```

2. **Write a lambda to sort a list of integers in descending order.**
   - **Code**:
     ```java
     import java.util.Arrays;
     import java.util.List;

     public class Main {
         public static void main(String[] args) {
             List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
             numbers.sort((a, b) -> b - a);
             System.out.println(numbers); // [9, 8, 5, 2, 1]
         }
     }
     ```

3. **Convert an anonymous inner class for a `Runnable` to a lambda expression.**
   - **Code**:
     ```java
     public class Main {
         public static void main(String[] args) {
             // Anonymous inner class
             Runnable r1 = new Runnable() {
                 public void run() {
                     System.out.println("Running...");
                 }
             };
             // Lambda equivalent
             Runnable r2 = () -> System.out.println("Running...");
             new Thread(r2).start();
         }
     }
     ```

4. **Write a lambda to filter strings starting with 'A' from a list.**
   - **Code**:
     ```java
     import java.util.Arrays;
     import java.util.List;

     public class Main {
         public static void main(String[] args) {
             List<String> names = Arrays.asList("Alice", "Bob", "Amy");
             names.stream()
                  .filter(name -> name.startsWith("A"))
                  .forEach(System.out::println); // Alice, Amy
         }
     }
     ```

5. **Explain variable capture in lambdas with an example.**
   - **Code**:
     ```java
     public class Main {
         public static void main(String[] args) {
             int x = 10;
             // Lambda captures local variable x
             Runnable r = () -> System.out.println("Value of x: " + x);
             r.run();
         }
     }
     ```

6. **Write a lambda to concatenate two strings.**
   - **Code**:
     ```java
     import java.util.function.BiFunction;

     public class Main {
         public static void main(String[] args) {
             BiFunction<String, String, String> concat = (s1, s2) -> s1 + s2;
             System.out.println(concat.apply("Hello, ", "World!")); // Hello, World!
         }
     }
     ```

7. **Write a lambda to check if a number is even.**
   - **Code**:
     ```java
     import java.util.function.Predicate;

     public class Main {
         public static void main(String[] args) {
             Predicate<Integer> isEven = n -> n % 2 == 0;
             System.out.println(isEven.test(4)); // true
             System.out.println(isEven.test(5)); // false
         }
     }
     ```

8. **Write a lambda to calculate the square of a number.**
   - **Code**:
     ```java
     import java.util.function.Function;

     public class Main {
         public static void main(String[] args) {
             Function<Integer, Integer> square = n -> n * n;
             System.out.println(square.apply(5)); // 25
         }
     }
     ```

9. **Write a lambda to validate an email using a regex.**
   - **Code**:
     ```java
     import java.util.function.Predicate;

     public class Main {
         public static void main(String[] args) {
             Predicate<String> isValidEmail = email -> email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
             System.out.println(isValidEmail.test("user@example.com")); // true
             System.out.println(isValidEmail.test("invalid.email")); // false
         }
     }
     ```

10. **Write a lambda to sort a list of `Employee` objects by name.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;

      class Employee {
          String name;
          double salary;
          Employee(String name, double salary) {
              this.name = name;
              this.salary = salary;
          }
          public String getName() { return name; }
      }

      public class Main {
          public static void main(String[] args) {
              List<Employee> employees = Arrays.asList(
                  new Employee("Bob", 50000),
                  new Employee("Alice", 60000)
              );
              employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
              employees.forEach(e -> System.out.println(e.getName())); // Alice, Bob
          }
      }
      ```

11. **Explain the target type of a lambda expression with an example.**
    - **Code**:
      ```java
      import java.util.function.Predicate;

      public class Main {
          public static void main(String[] args) {
              // Lambda assigned to Predicate functional interface
              Predicate<String> isEmpty = s -> s.isEmpty();
              System.out.println(isEmpty.test("")); // true
          }
      }
      ```

12. **Write a lambda to reverse a string.**
    - **Code**:
      ```java
      import java.util.function.Function;

      public class Main {
          public static void main(String[] args) {
              Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();
              System.out.println(reverse.apply("Hello")); // olleH
          }
      }
      ```

13. **Write a lambda to find the maximum of two numbers.**
    - **Code**:
      ```java
      import java.util.function.BiFunction;

      public class Main {
          public static void main(String[] args) {
              BiFunction<Integer, Integer, Integer> max = (a, b) -> a > b ? a : b;
              System.out.println(max.apply(10, 20)); // 20
          }
      }
      ```

14. **Write a lambda to count characters in a string.**
    - **Code**:
      ```java
      import java.util.function.Function;

      public class Main {
          public static void main(String[] args) {
              Function<String, Integer> countChars = s -> s.length();
              System.out.println(countChars.apply("Java")); // 4
          }
      }
      ```

15. **Write a lambda to check if a list contains a specific element.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.function.Predicate;

      public class Main {
          public static void main(String[] args) {
              List<String> list = Arrays.asList("Java", "Python");
              Predicate<List<String>> containsJava = l -> l.contains("Java");
              System.out.println(containsJava.test(list)); // true
          }
      }
      ```

16. **Write a lambda to convert a list of integers to their squares.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(1, 2, 3);
              numbers.replaceAll(n -> n * n);
              System.out.println(numbers); // [1, 4, 9]
          }
      }
      ```

17. **Write a lambda to remove whitespace from a string.**
    - **Code**:
      ```java
      import java.util.function.Function;

      public class Main {
          public static void main(String[] args) {
              Function<String, String> removeWhitespace = s -> s.replaceAll("\\s", "");
              System.out.println(removeWhitespace.apply("Java 8")); // Java8
          }
      }
      ```

18. **Write a lambda to check if all elements in a list are positive.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.function.Predicate;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(1, 2, 3);
              Predicate<List<Integer>> allPositive = list -> list.stream().allMatch(n -> n > 0);
              System.out.println(allPositive.test(numbers)); // true
          }
      }
      ```

19. **Write a lambda to format a number as currency.**
    - **Code**:
      ```java
      import java.text.NumberFormat;
      import java.util.function.Function;

      public class Main {
          public static void main(String[] args) {
              Function<Double, String> formatCurrency = d -> NumberFormat.getCurrencyInstance().format(d);
              System.out.println(formatCurrency.apply(1234.56)); // $1,234.56 (locale-dependent)
          }
      }
      ```

20. **Write a lambda to replace all occurrences of a substring.**
    - **Code**:
      ```java
      import java.util.function.BiFunction;

      public class Main {
          public static void main(String[] args) {
              BiFunction<String, String, String> replace = (s, sub) -> s.replace(sub, "X");
              System.out.println(replace.apply("Hello World", "o")); // HellX WXrld
          }
      }
      ```

## Functional Interfaces (15 Questions)

21. **What is a functional interface? List some built-in functional interfaces.**
    - **Explanation**: A functional interface has exactly one abstract method, e.g., `Predicate`, `Function`, `Consumer`, `Supplier`.
    - **Code**:
      ```java
      import java.util.function.Predicate;

      public class Main {
          public static void main(String[] args) {
              Predicate<String> isNotEmpty = s -> !s.isEmpty();
              System.out.println(isNotEmpty.test("Java")); // true
          }
      }
      ```

22. **Write a custom functional interface to calculate the cube of a number.**
    - **Code**:
      ```java
      @FunctionalInterface
      interface CubeCalculator {
          long calculate(int n);
      }

      public class Main {
          public static void main(String[] args) {
              CubeCalculator cube = n -> n * n * n;
              System.out.println(cube.calculate(3)); // 27
          }
      }
      ```

23. **Write a `Predicate` to check if a number is greater than 100.**
    - **Code**:
      ```java
      import java.util.function.Predicate;

      public class Main {
          public static void main(String[] args) {
              Predicate<Integer> greaterThan100 = n -> n > 100;
              System.out.println(greaterThan100.test(150)); // true
          }
      }
      ```

24. **Write a `Function` to convert a string to its length.**
    - **Code**:
      ```java
      import java.util.function.Function;

      public class Main {
          public static void main(String[] args) {
              Function<String, Integer> length = String::length;
              System.out.println(length.apply("Java")); // 4
          }
      }
      ```

25. **Write a `Consumer` to log a message to the console.**
    - **Code**:
      ```java
      import java.util.function.Consumer;

      public class Main {
          public static void main(String[] args) {
              Consumer<String> logger = msg -> System.out.println("Log: " + msg);
              logger.accept("Operation successful");
          }
      }
      ```

26. **Write a `Supplier` to generate a random number.**
    - **Code**:
      ```java
      import java.util.Random;
      import java.util.function.Supplier;

      public class Main {
          public static void main(String[] args) {
              Supplier<Integer> randomNum = () -> new Random().nextInt(100);
              System.out.println(randomNum.get());
          }
      }
      ```

27. **Combine two `Predicate` instances to check if a number is even and positive.**
    - **Code**:
      ```java
      import java.util.function.Predicate;

      public class Main {
          public static void main(String[] args) {
              Predicate<Integer> isEven = n -> n % 2 == 0;
              Predicate<Integer> isPositive = n -> n > 0;
              Predicate<Integer> evenAndPositive = isEven.and(isPositive);
              System.out.println(evenAndPositive.test(4)); // true
          }
      }
      ```

28. **Write a `BiFunction` to multiply two numbers.**
    - **Code**:
      ```java
      import java.util.function.BiFunction;

      public class Main {
          public static void main(String[] args) {
              BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
              System.out.println(multiply.apply(5, 3)); // 15
          }
      }
      ```

29. **Write a `BiConsumer` to append two strings to a `StringBuilder`.**
    - **Code**:
      ```java
      import java.util.function.BiConsumer;

      public class Main {
          public static void main(String[] args) {
              StringBuilder sb = new StringBuilder();
              BiConsumer<String, String> append = (s1, s2) -> sb.append(s1).append(s2);
              append.accept("Hello, ", "World!");
              System.out.println(sb); // Hello, World!
          }
      }
      ```

30. **Write a `UnaryOperator` to double a number.**
    - **Code**:
      ```java
      import java.util.function.UnaryOperator;

      public class Main {
          public static void main(String[] args) {
              UnaryOperator<Integer> doubleNum = n -> n * 2;
              System.out.println(doubleNum.apply(5)); // 10
          }
      }
      ```

31. **Write a `BinaryOperator` to find the minimum of two numbers.**
    - **Code**:
      ```java
      import java.util.function.BinaryOperator;

      public class Main {
          public static void main(String[] args) {
              BinaryOperator<Integer> min = (a, b) -> a < b ? a : b;
              System.out.println(min.apply(10, 20)); // 10
          }
      }
      ```

32. **Write a `Predicate` to check if a string is a palindrome.**
    - **Code**:
      ```java
      import java.util.function.Predicate;

      public class Main {
          public static void main(String[] args) {
              Predicate<String> isPalindrome = s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
              System.out.println(isPalindrome.test("radar")); // true
          }
      }
      ```

33. **Write a `Function` to parse a string to an integer.**
    - **Code**:
      ```java
      import java.util.function.Function;

      public class Main {
          public static void main(String[] args) {
              Function<String, Integer> parseInt = Integer::parseInt;
              System.out.println(parseInt.apply("123")); // 123
          }
      }
      ```

34. **Write a `Supplier` to provide the current timestamp.**
    - **Code**:
      ```java
      import java.time.LocalDateTime;
      import java.util.function.Supplier;

      public class Main {
          public static void main(String[] args) {
              Supplier<LocalDateTime> now = LocalDateTime::now;
              System.out.println(now.get());
          }
      }
      ```

35. **Write a `Consumer` to add an element to a list.**
    - **Code**:
      ```java
      import java.util.ArrayList;
      import java.util.List;
      import java.util.function.Consumer;

      public class Main {
          public static void main(String[] args) {
              List<String> list = new ArrayList<>();
              Consumer<String> addToList = list::add;
              addToList.accept("Java");
              System.out.println(list); // [Java]
          }
      }
      ```

## Streams API (30 Questions)

36. **What is the Streams API, and how does it support functional programming?**
    - **Explanation**: Streams provide a declarative way to process collections using functional-style operations.
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(1, 2, 3);
              numbers.stream().forEach(System.out::println);
          }
      }
      ```

37. **Write a Stream to filter even numbers from a list.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
              List<Integer> evens = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
              System.out.println(evens); // [2, 4]
          }
      }
      ```

38. **Write a Stream to double all numbers in a list.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(1, 2, 3);
              List<Integer> doubled = numbers.stream()
                                             .map(n -> n * 2)
                                             .collect(Collectors.toList());
              System.out.println(doubled); // [2, 4, 6]
          }
      }
      ```

39. **Write a Stream to find the sum of all numbers in a list.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(1, 2, 3);
              int sum = numbers.stream().mapToInt(Integer::intValue).sum();
              System.out.println(sum); // 6
          }
      }
      ```

40. **Write a Stream to find duplicates in a list.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.Set;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3);
              Set<Integer> duplicates = numbers.stream()
                                              .filter(n -> numbers.indexOf(n) != numbers.lastIndexOf(n))
                                              .collect(Collectors.toSet());
              System.out.println(duplicates); // [2, 3]
          }
      }
      ```

41. **Write a Stream to group employees by department.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.Map;
      import java.util.stream.Collectors;

      class Employee {
          String name, dept;
          Employee(String name, String dept) {
              this.name = name;
              this.dept = dept;
          }
          public String getDept() { return dept; }
          public String getName() { return name; }
      }

      public class Main {
          public static void main(String[] args) {
              List<Employee> employees = Arrays.asList(
                  new Employee("Alice", "HR"),
                  new Employee("Bob", "IT")
              );
              Map<String, List<Employee>> byDept = employees.stream()
                                                           .collect(Collectors.groupingBy(Employee::getDept));
              System.out.println(byDept);
          }
      }
      ```

42. **Write a Stream to find the first element greater than 5.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(1, 2, 6, 7);
              numbers.stream()
                     .filter(n -> n > 5)
                     .findFirst()
                     .ifPresent(System.out::println); // 6
          }
      }
      ```

43. **Write a Stream to sort a list of strings in descending order.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<String> names = Arrays.asList("Bob", "Alice", "Charlie");
              List<String> sorted = names.stream()
                                         .sorted((a, b) -> b.compareTo(a))
                                         .collect(Collectors.toList());
              System.out.println(sorted); // [Charlie, Bob, Alice]
          }
      }
      ```

44. **Write a Stream to remove duplicates from a list.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(1, 2, 2, 3);
              List<Integer> unique = numbers.stream()
                                            .distinct()
                                            .collect(Collectors.toList());
              System.out.println(unique); // [1, 2, 3]
          }
      }
      ```

45. **Write a Stream to count the frequency of each word in a list.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.Map;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<String> words = Arrays.asList("apple", "banana", "apple");
              Map<String, Long> frequency = words.stream()
                                                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
              System.out.println(frequency); // {apple=2, banana=1}
          }
      }
      ```

46. **Write a Stream to partition numbers into even and odd.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.Map;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
              Map<Boolean, List<Integer>> partitioned = numbers.stream()
                                                              .collect(Collectors.partitioningBy(n -> n % 2 == 0));
              System.out.println(partitioned); // {false=[1, 3], true=[2, 4]}
          }
      }
      ```

47. **Write a Stream to join a list of strings with a comma.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<String> words = Arrays.asList("apple", "banana");
              String joined = words.stream()
                                   .collect(Collectors.joining(", "));
              System.out.println(joined); // apple, banana
          }
      }
      ```

48. **Write a Stream to find the maximum number in a list.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(1, 2, 3);
              numbers.stream()
                     .max(Integer::compareTo)
                     .ifPresent(System.out::println); // 3
          }
      }
      ```

49. **Write a Stream to flatten a list of lists.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<List<Integer>> nested = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
              List<Integer> flat = nested.stream()
                                         .flatMap(List::stream)
                                         .collect(Collectors.toList());
              System.out.println(flat); // [1, 2, 3, 4]
          }
      }
      ```

50. **Write a Stream to calculate the average of a list of numbers.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(1, 2, 3);
              double average = numbers.stream()
                                      .mapToInt(Integer::intValue)
                                      .average()
                                      .orElse(0.0);
              System.out.println(average); // 2.0
          }
      }
      ```

51. **Write a Stream to find the second largest number.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(1, 3, 2, 4);
              numbers.stream()
                     .sorted((a, b) -> b - a)
                     .skip(1)
                     .findFirst()
                     .ifPresent(System.out::println); // 3
          }
      }
      ```

52. **Write a Stream to convert a list of strings to uppercase.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<String> words = Arrays.asList("apple", "banana");
              List<String> upper = words.stream()
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());
              System.out.println(upper); // [APPLE, BANANA]
          }
      }
      ```

53. **Write a Stream to process a list in parallel.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(1, 2, 3);
              numbers.parallelStream()
                     .map(n -> n * 2)
                     .forEach(System.out::println); // Order may vary
          }
      }
      ```

54. **Write a Stream to find all numbers divisible by 3.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(3, 4, 6, 7);
              List<Integer> divisibleBy3 = numbers.stream()
                                                 .filter(n -> n % 3 == 0)
                                                 .collect(Collectors.toList());
              System.out.println(divisibleBy3); // [3, 6]
          }
      }
      ```

55. **Write a Stream to reverse a list of numbers.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(1, 2, 3);
              List<Integer> reversed = numbers.stream()
                                              .sorted((a, b) -> b - a)
                                              .collect(Collectors.toList());
              System.out.println(reversed); // [3, 2, 1]
          }
      }
      ```

56. **Write a Stream to find the longest string in a list.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;

      public class Main {
          public static void main(String[] args) {
              List<String> words = Arrays.asList("apple", "banana", "cherry");
              words.stream()
                   .max((a, b) -> Integer.compare(a.length(), b.length()))
                   .ifPresent(System.out::println); // banana
          }
      }
      ```

57. **Write a Stream to check if any string starts with 'A'.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;

      public class Main {
          public static void main(String[] args) {
              List<String> words = Arrays.asList("Apple", "Banana");
              boolean hasA = words.stream().anyMatch(s -> s.startsWith("A"));
              System.out.println(hasA); // true
          }
      }
      ```

58. **Write a Stream to collect strings into a `Set`.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.Set;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<String> words = Arrays.asList("apple", "apple", "banana");
              Set<String> unique = words.stream()
                                        .collect(Collectors.toSet());
              System.out.println(unique); // [apple, banana]
          }
      }
      ```

59. **Write a Stream to sum squares of numbers.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(1, 2, 3);
              int sum = numbers.stream()
                               .map(n -> n * n)
                               .reduce(0, Integer::sum);
              System.out.println(sum); // 14 (1 + 4 + 9)
          }
      }
      ```

60. **Write a Stream to group strings by their length.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.Map;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<String> words = Arrays.asList("cat", "dog", "apple");
              Map<Integer, List<String>> byLength = words.stream()
                                                        .collect(Collectors.groupingBy(String::length));
              System.out.println(byLength); // {3=[cat, dog], 5=[apple]}
          }
      }
      ```

61. **Write a Stream to find the top 3 numbers in a list.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
              List<Integer> top3 = numbers.stream()
                                          .sorted((a, b) -> b - a)
                                          .limit(3)
                                          .collect(Collectors.toList());
              System.out.println(top3); // [9, 8, 5]
          }
      }
      ```

62. **Write a Stream to skip the first 2 elements.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
              List<Integer> skipped = numbers.stream()
                                             .skip(2)
                                             .collect(Collectors.toList());
              System.out.println(skipped); // [3, 4]
          }
      }
      ```

63. **Write a Stream to check if all numbers are positive.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;

      public class Main {
          public static void main(String[] args) {
              List<Integer> numbers = Arrays.asList(1, 2, 3);
              boolean allPositive = numbers.stream().allMatch(n -> n > 0);
              System.out.println(allPositive); // true
          }
      }
      ```

64. **Write a Stream to convert a list to a map.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.Map;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<String> words = Arrays.asList("apple", "banana");
              Map<String, Integer> map = words.stream()
                                              .collect(Collectors.toMap(s -> s, String::length));
              System.out.println(map); // {apple=5, banana=6}
          }
      }
      ```

65. **Write a Stream to process financial transactions.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.stream.Collectors;

      class Transaction {
          double amount;
          Transaction(double amount) { this.amount = amount; }
          public double getAmount() { return amount; }
      }

      public class Main {
          public static void main(String[] args) {
              List<Transaction> transactions = Arrays.asList(new Transaction(100), new Transaction(200));
              List<Transaction> highValue = transactions.stream()
                                                       .filter(t -> t.getAmount() > 150)
                                                       .collect(Collectors.toList());
              System.out.println(highValue.size()); // 1
          }
      }
      ```

## Optional Class (15 Questions)

66. **What is the `Optional` class, and how does it prevent `NullPointerException`?**
    - **Explanation**: `Optional` wraps a value that may be null, encouraging explicit null handling.
    - **Code**:
      ```java
      import java.util.Optional;

      public class Main {
          public static void main(String[] args) {
              Optional<String> opt = Optional.ofNullable(null);
              System.out.println(opt.orElse("Default")); // Default
          }
      }
      ```

67. **Write code to return a default value if an `Optional` is empty.**
    - **Code**:
      ```java
      import java.util.Optional;

      public class Main {
          public static void main(String[] args) {
              Optional<String> opt = Optional.empty();
              System.out.println(opt.orElse("Default")); // Default
          }
      }
      ```

68. **Write code to chain `Optional` operations.**
    - **Code**:
      ```java
      import java.util.Optional;

      public class Main {
          public static void main(String[] args) {
              Optional<String> opt = Optional.of("java");
              String result = opt.map(String::toUpperCase).orElse("NONE");
              System.out.println(result); // JAVA
          }
      }
      ```

69. **Write code to throw an exception if an `Optional` is empty.**
    - **Code**:
      ```java
      import java.util.Optional;

      public class Main {
          public static void main(String[] args) {
              Optional<String> opt = Optional.empty();
              try {
                  opt.orElseThrow(() -> new IllegalArgumentException("Empty value"));
              } catch (IllegalArgumentException e) {
                  System.out.println(e.getMessage()); // Empty value
              }
          }
      }
      ```

70. **Write code to filter an `Optional` value.**
    - **Code**:
      ```java
      import java.util.Optional;

      public class Main {
          public static void main(String[] args) {
              Optional<String> opt = Optional.of("Java");
              opt.filter(s -> s.length() > 3)
                 .ifPresent(System.out::println); // Java
          }
      }
      ```

71. **Write code to handle nested `Optional` values.**
    - **Code**:
      ```java
      import java.util.Optional;

      class Department {
          String name;
          Department(String name) { this.name = name; }
      }

      class Employee {
          Optional<Department> dept;
          Employee(Department dept) { this.dept = Optional.ofNullable(dept); }
          public Optional<Department> getDept() { return dept; }
      }

      public class Main {
          public static void main(String[] args) {
              Employee emp = new Employee(null);
              String deptName = emp.getDept()
                                   .map(Department::name)
                                   .orElse("Unknown");
              System.out.println(deptName); // Unknown
          }
      }
      ```

72. **Write code to use `Optional` with Streams.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.Optional;

      public class Main {
          public static void main(String[] args) {
              List<String> words = Arrays.asList("Java", "");
              Optional<String> firstNonEmpty = words.stream()
                                                   .filter(s -> !s.isEmpty())
                                                   .findFirst();
              firstNonEmpty.ifPresent(System.out::println); // Java
          }
      }
      ```

73. **Write code to use `orElseGet` vs. `orElse`.**
    - **Code**:
      ```java
      import java.util.Optional;

      public class Main {
          public static void main(String[] args) {
              Optional<String> opt = Optional.empty();
              String orElse = opt.orElse(getDefault()); // Always calls getDefault
              String orElseGet = opt.orElseGet(Main::getDefault); // Lazy evaluation
              System.out.println(orElseGet);
          }

          static String getDefault() {
              System.out.println("Computing default");
              return "Default";
          }
      }
      ```

74. **Write code to transform an `Optional` value.**
    - **Code**:
      ```java
      import java.util.Optional;

      public class Main {
          public static void main(String[] args) {
              Optional<String> opt = Optional.of("123");
              Optional<Integer> num = opt.map(Integer::parseInt);
              num.ifPresent(System.out::println); // 123
          }
      }
      ```

75. **Write code to combine two `Optional` values.**
    - **Code**:
      ```java
      import java.util.Optional;

      public class Main {
          public static void main(String[] args) {
              Optional<String> first = Optional.of("Hello");
              Optional<String> second = Optional.of("World");
              String result = first.flatMap(f -> second.map(s -> f + " " + s)).orElse("");
              System.out.println(result); // Hello World
          }
      }
      ```

76. **Write code to handle null checks with `Optional`.**
    - **Code**:
      ```java
      import java.util.Optional;

      public class Main {
          public static void main(String[] args) {
              String value = null;
              Optional<String> opt = Optional.ofNullable(value);
              System.out.println(opt.isPresent()); // false
          }
      }
      ```

77. **Write code to use `ifPresent` with `Optional`.**
    - **Code**:
      ```java
      import java.util.Optional;

      public class Main {
          public static void main(String[] args) {
              Optional<String> opt = Optional.of("Java");
              opt.ifPresent(System.out::println); // Java
          }
      }
      ```

78. **Write code to return `Optional` from a method.**
    - **Code**:
      ```java
      import java.util.Optional;

      public class Main {
          public static void main(String[] args) {
              Optional<String> result = findName("Alice");
              result.ifPresent(System.out::println); // Alice
          }

          static Optional<String> findName(String name) {
              return name != null ? Optional.of(name) : Optional.empty();
          }
      }
      ```

79. **Write code to use `Optional` in a banking scenario.**
    - **Code**:
      ```java
      import java.util.Optional;

      class Account {
          Double balance;
          Account(Double balance) { this.balance = balance; }
          public Double getBalance() { return balance; }
      }

      public class Main {
          public static void main(String[] args) {
              Account account = new Account(null);
              Optional.ofNullable(account.getBalance())
                     .orElse(0.0);
              System.out.println("Balance: " + account.getBalance()); // null (or handle via Optional)
          }
      }
      ```

80. **Write code to chain multiple `Optional` operations.**
    - **Code**:
      ```java
      import java.util.Optional;

      public class Main {
          public static void main(String[] args) {
              Optional<String> opt = Optional.of("123");
              Optional<String> result = opt.filter(s -> s.length() == 3)
                                           .map(s -> s + "!");
              result.ifPresent(System.out::println); // 123!
          }
      }
      ```

## Date and Time API (10 Questions)

81. **What are the advantages of the new Date and Time API?**
    - **Explanation**: Immutable, thread-safe, and clearer than `java.util.Date`.
    - **Code**:
      ```java
      import java.time.LocalDate;

      public class Main {
          public static void main(String[] args) {
              LocalDate today = LocalDate.now();
              System.out.println(today);
          }
      }
      ```

82. **Write code to get the current date.**
    - **Code**:
      ```java
      import java.time.LocalDate;

      public class Main {
          public static void main(String[] args) {
              LocalDate today = LocalDate.now();
              System.out.println(today);
          }
      }
      ```

83. **Write code to calculate days between two dates.**
    - **Code**:
      ```java
      import java.time.LocalDate;
      import java.time.temporal.ChronoUnit;

      public class Main {
          public static void main(String[] args) {
              LocalDate start = LocalDate.of(2025, 1, 1);
              LocalDate end = LocalDate.of(2025, 4, 26);
              long days = ChronoUnit.DAYS.between(start, end);
              System.out.println(days); // 115
          }
      }
      ```

84. **Write code to format a `LocalDateTime`.**
    - **Code**:
      ```java
      import java.time.LocalDateTime;
      import java.time.format.DateTimeFormatter;

      public class Main {
          public static void main(String[] args) {
              LocalDateTime now = LocalDateTime.now();
              DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
              System.out.println(now.format(formatter));
          }
      }
      ```

85. **Write code to parse a string to `LocalDate`.**
    - **Code**:
      ```java
      import java.time.LocalDate;

      public class Main {
          public static void main(String[] args) {
              LocalDate date = LocalDate.parse("2025-04-26");
              System.out.println(date);
          }
      }
      ```

86. **Write code to find the next Friday.**
    - **Code**:
      ```java
      import java.time.LocalDate;
      import java.time.temporal.TemporalAdjusters;
      import java.time.DayOfWeek;

      public class Main {
          public static void main(String[] args) {
              LocalDate today = LocalDate.now();
              LocalDate nextFriday = today.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
              System.out.println(nextFriday);
          }
      }
      ```

87. **Write code to check if a year is a leap year.**
    - **Code**:
      ```java
      import java.time.Year;

      public class Main {
          public static void main(String[] args) {
              Year year = Year.of(2024);
              System.out.println(year.isLeap()); // true
          }
      }
      ```

88. **Write code to add 10 days to the current date.**
    - **Code**:
      ```java
      import java.time.LocalDate;

      public class Main {
          public static void main(String[] args) {
              LocalDate today = LocalDate.now();
              LocalDate future = today.plusDays(10);
              System.out.println(future);
          }
      }
      ```

89. **Write code to get the current time in a specific timezone.**
    - **Code**:
      ```java
      import java.time.ZonedDateTime;
      import java.time.ZoneId;

      public class Main {
          public static void main(String[] args) {
              ZonedDateTime time = ZonedDateTime.now(ZoneId.of("Asia/Dubai"));
              System.out.println(time);
          }
      }
      ```

90. **Write code to convert `LocalDate` to `LocalDateTime`.**
    - **Code**:
      ```java
      import java.time.LocalDate;
      import java.time.LocalDateTime;

      public class Main {
          public static void main(String[] args) {
              LocalDate date = LocalDate.now();
              LocalDateTime dateTime = date.atStartOfDay();
              System.out.println(dateTime);
          }
      }
      ```

## Default/Static Methods in Interfaces (3 Questions)

91. **What are default methods, and why were they introduced?**
    - **Explanation**: Allow adding methods to interfaces without breaking existing implementations.
    - **Code**:
      ```java
      interface MyInterface {
          default void greet() {
              System.out.println("Hello!");
          }
      }

      public class Main implements MyInterface {
          public static void main(String[] args) {
              new Main().greet(); // Hello!
          }
      }
      ```

92. **Write an interface with a default method.**
    - **Code**:
      ```java
      interface BankService {
          default double calculateInterest(double balance) {
              return balance * 0.05;
          }
      }

      public class Main implements BankService {
          public static void main(String[] args) {
              Main account = new Main();
              System.out.println(account.calculateInterest(1000)); // 50.0
          }
      }
      ```

93. **Write an interface with a static method.**
    - **Code**:
      ```java
      interface Utility {
          static String getVersion() {
              return "1.0";
          }
      }

      public class Main {
          public static void main(String[] args) {
              System.out.println(Utility.getVersion()); // 1.0
          }
      }
      ```

## Method References (2 Questions)

94. **What are method references? Explain the types.**
    - **Explanation**: Shorthand for lambdas, e.g., static, instance, constructor.
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;

      public class Main {
          public static void main(String[] args) {
              List<String> words = Arrays.asList("apple", "banana");
              words.forEach(System.out::println); // Instance method reference
          }
      }
      ```

95. **Write a Stream using method references.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<String> words = Arrays.asList("apple", "banana");
              List<String> upper = words.stream()
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());
              System.out.println(upper); // [APPLE, BANANA]
          }
      }
      ```

## Practical Scenarios (5 Questions)

96. **Write code to process a list of transactions to find total amount.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;

      class Transaction {
          double amount;
          Transaction(double amount) { this.amount = amount; }
          public double getAmount() { return amount; }
      }

      public class Main {
          public static void main(String[] args) {
              List<Transaction> transactions = Arrays.asList(
                  new Transaction(100),
                  new Transaction(200)
              );
              double total = transactions.stream()
                                         .mapToDouble(Transaction::getAmount)
                                         .sum();
              System.out.println(total); // 300.0
          }
      }
      ```

97. **Write code to filter valid email addresses.**
    - **Code**:
      ```java
      import java.util.Arrays;
      import java.util.List;
      import java.util.stream.Collectors;

      public class Main {
          public static void main(String[] args) {
              List<String> emails = Arrays.asList("user@example.com", "invalid");
              List<String> valid = emails.stream()
                                         .filter(e -> e.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
                                         .collect(Collectors.toList());
              System.out.println(valid); // [user@example.com]
          }
      }
      ```

98. **Write code to group transactions by date.**
    - **Code**:
      ```java
      import java.time.LocalDate;
      import java.util.Arrays;
      import java.util.List;
      import java.util.Map;
      import java.util.stream.Collectors;

      class Transaction {
          LocalDate date;
          double amount;
          Transaction(LocalDate date, double amount) {
              this.date = date;
              this.amount = amount;
          }
          public LocalDate getDate() { return date; }
      }

      public class Main {
          public static void main(String[] args) {
              List<Transaction> transactions = Arrays.asList(
                  new Transaction(LocalDate.of(2025, 1, 1), 100),
                  new Transaction(LocalDate.of(2025, 1, 1), 200)
              );
              Map<LocalDate, List<Transaction>> byDate = transactions.stream()
                                                                    .collect(Collectors.groupingBy(Transaction::getDate));
              System.out.println(byDate);
          }
      }
      ```

99. **Write code to validate account balances using `Optional`.**
    - **Code**:
      ```java
      import java.util.Optional;

      class Account {
          Double balance;
          Account(Double balance) { this.balance = balance; }
          public Double getBalance() { return balance; }
      }

      public class Main {
          public static void main(String[] args) {
              Account account = new Account(null);
              Optional.ofNullable(account.getBalance())
                     .filter(b -> b > 0)
                     .ifPresent(b -> System.out.println("Valid balance: " + b));
          }
      }
      ```

100. **Write code to process a list of orders and calculate total revenue.**
     - **Code**:
       ```java
       import java.util.Arrays;
       import java.util.List;

       class Order {
           double amount;
           Order(double amount) { this.amount = amount; }
           public double getAmount() { return amount; }
       }

       public class Main {
           public static void main(String[] args) {
               List<Order> orders = Arrays.asList(
                   new Order(100),
                   new Order(200)
               );
               double revenue = orders.stream()
                                      .mapToDouble(Order::getAmount)
                                      .sum();
               System.out.println("Total revenue: " + revenue); // 300.0
           }
       }
       ```