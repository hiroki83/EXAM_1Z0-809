package reading4th.chapter4.peek_p201;

import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;

public class TestClass {
  public static void main(String ... args) {
    List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
    list.stream().filter(n -> n.length() == 4)
                 .peek(s -> {System.out.println("after filter(): "); System.out.println(s);})
                 .sorted()
                 .peek(s -> {System.out.println("after sorted(): "); System.out.println(s);})
                 .limit(2)
                 //.forEach(System.out::println);
                 .forEach(s -> {System.out.println("after limit(): "); System.out.println(s);});
  }
}
