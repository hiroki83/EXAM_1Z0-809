package reading3rd.chapter4.advancedstream_p213.basiccollectors;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.TreeSet;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
    String result = ohMy.collect(Collectors.joining(","));
    System.out.println(result);
    Stream<String> ohMyGod = Stream.of("lions", "tigers", "bears");
    Double result2 = ohMyGod.collect(Collectors.averagingInt(String::length));
    System.out.println(result2);


    Stream<String> ohJesus = Stream.of("lions", "tigers", "bears");
    TreeSet<String> result3 = ohJesus.filter(s -> s.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));
    System.out.println(result3);
  }
}
