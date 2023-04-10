package reading2nd.chapter7.parallelstreams;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestParallelStream {
  public static void main(String[] args) {
    Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).parallelStream();
    stream.forEach(s -> System.out.print(s+" "));
  }
}
