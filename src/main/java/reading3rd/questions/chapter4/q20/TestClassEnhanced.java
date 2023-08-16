package reading3rd.questions.chapter4.q20;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class TestClassEnhanced {
  public static void main(String ... args) {
    IntStream.range(1,6).forEach(System.out::println);
    IntStream.range(1,6).mapToObj(i -> i).forEach(System.out::println);
  }
}
