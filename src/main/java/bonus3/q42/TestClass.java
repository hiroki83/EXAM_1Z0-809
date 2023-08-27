package bonus3.q42;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> s = Stream.empty();
    Stream<String> s2 = Stream.empty();
    Predicate<String> condition = b -> b.startsWith("c");
    Function<String, Boolean> condition2 = b -> b.startsWith("c");
    Map<Boolean, List<String>> p = s.collect(Collectors.partitioningBy(condition));
    //Map<Boolean, List<String>> g = s2.collect(Collectors.groupingBy(condition)); // DOES NOT COMPILE
    //Map<Boolean, List<String>> g = s2.collect(Collectors.groupingBy(condition2));
    Map<Boolean, List<String>> g = s2.collect(Collectors.groupingBy(b -> b.startsWith("c")));
    System.out.println(p + " " + g);
  }
}
