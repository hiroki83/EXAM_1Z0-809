package chapter4.primitive_streams.summarizing;

import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestClass {
  public static void main(String[] args) {
    //System.out.println(max(IntStream.empty()));
    System.out.println(max(IntStream.of(1,5,20,10)));
    //System.out.println(range(IntStream.empty()));
    System.out.println(range(IntStream.of(1,5,20,10)));
  }
  private static int max(IntStream ints) {
    OptionalInt optional = ints.max();
    return optional.orElseThrow(RuntimeException::new);
  }
  private static int range(IntStream ints) {
    IntSummaryStatistics stats = ints.summaryStatistics();
    if (stats.getCount() == 0) throw new RuntimeException();
    return stats.getMax()- stats.getMin();
  }
}
