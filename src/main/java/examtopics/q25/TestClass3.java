package examtopics.q25;

import java.util.function.Predicate;
import java.util.List;
import java.util.Arrays;

interface CourseFilter2 extends Predicate<String> {
  public default boolean test(String str) {
    return str.equals("Java");
  }
}

public class TestClass3 {
  public static void main(String ... args) {
    List<String> strs = Arrays.asList("Java", "Java EE", "Java ME");
    Predicate<String> cf1 = s -> s.length() > 3;
    Predicate<String> cf2 = new CourseFilter2() { // line n1
      public boolean contains(String s) {
        return s.contains("Java");
      }
    };

    long c = strs.stream()
      .filter(cf1)
      .filter(cf2) // line n2
      .count();
    System.out.println(c); // 1
  }
}
