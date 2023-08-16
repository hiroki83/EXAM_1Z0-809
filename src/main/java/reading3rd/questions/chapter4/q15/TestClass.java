package reading3rd.questions.chapter4.q15;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Map;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
    Map<Boolean, Map<String, Integer>> map = ohMy.collect(Collectors.partitioningBy(s -> s.length() <= 7, Collectors.toMap(s -> s, String::length)));
    System.out.println(map);
  }
}
