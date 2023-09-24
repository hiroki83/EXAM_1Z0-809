package reading4th.chapter4.summarystatistics_p218;

import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;

public class TestClass {
  public static void main(String ... args) {
    LongStream longs = LongStream.of(1,2,3);
    LongSummaryStatistics stats = longs.summaryStatistics();
  }
}
