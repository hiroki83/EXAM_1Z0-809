package reading3rd.chapter4.summarizingstatistics_p210;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.IntSummaryStatistics;

public class TestClass {
  private static int max(IntStream ints) {
    OptionalInt optional = ints.max();
    return optional.orElseThrow(RuntimeException::new);
  }
  private static int range(IntStream ints) {
    IntSummaryStatistics stats = ints.summaryStatistics();
    if (stats.getCount() == 0) throw new RuntimeException();
    return stats.getMax()-stats.getMin();
  }
  public static void main(String ... args) {
    IntStream s1 = IntStream.of(50,100);
    System.out.println(max(s1));
    IntStream s2 = IntStream.of(5,10);
    System.out.println(range(s2));
  }
}
