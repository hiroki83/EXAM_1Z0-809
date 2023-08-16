package reading3rd.questions.chapter4.q20;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class TestClass {
  public static void main(String ... args) {
    List<Integer> l = IntStream.range(1,6)
      .mapToObj(i -> i).collect(Collectors.toList());
    l.forEach(System.out::println);
  }
}
