package reading2nd.chapter7.parallelstreams;

import java.util.Arrays;

public class TestCreatingUnorderedStreams {
  public static void main(String ... args) {
    Arrays.asList(1,2,3,4,5,6).stream().unordered().forEach(System.out::print);
    System.out.println();
    Arrays.asList(1,2,3,4,5,6).stream().unordered().parallel().forEach(System.out::print);
  }
}
