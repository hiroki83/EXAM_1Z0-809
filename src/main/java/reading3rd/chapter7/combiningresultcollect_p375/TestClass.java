package reading3rd.chapter7.combiningresultcollect_p375;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Stream;
import java.util.SortedSet;
import java.util.Set;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> stream = Stream.of("w","o","l","f").parallel();
    SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
    System.out.println(set); // [f, l, o, w]
  }
}
