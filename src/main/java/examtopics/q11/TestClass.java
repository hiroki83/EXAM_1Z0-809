package examtopics.q11;

import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.List;

public class TestClass {
  public static void main(String ... args) {
    Stream<List<String>> iStr = Stream.of(Arrays.asList("1","Jhon"), Arrays.asList("1", null));
    //Stream<String> nlnSt = iStr.flatMapToInt((x) -> x.stream()); // DOES NOT COMPILE
    Stream<String> nlnSt = iStr.flatMap((x) -> x.stream());
    nlnSt.forEach(System.out::print);
  }
}
