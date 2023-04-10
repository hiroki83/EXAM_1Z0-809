package reading2nd.chapter7.parallelstreams;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class TestCombiningResultsWithCollectMethod {
  public static void main(String ... args) {
    Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
    SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
    System.out.println("parallel stream" + set);
    Stream<String> serialStream = Stream.of("w", "o", "l", "f");
    //Stream<String> serialStream = Stream.of("w", "o", "l", "f").parallel();
    SortedSet<String> serialStreamSet = serialStream.collect(TreeSet::new, Set::add, Set::addAll);
    System.out.println("serial stream" + serialStreamSet);
  }
}
