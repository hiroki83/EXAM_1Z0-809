package reading2nd.chapter7.parallelstreams;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestParallel {
  public static void main(String[] args) {
    Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream();
    Stream<Integer> parallelStream = stream.parallel();
    parallelStream.forEach(System.out::println);
  }
}
