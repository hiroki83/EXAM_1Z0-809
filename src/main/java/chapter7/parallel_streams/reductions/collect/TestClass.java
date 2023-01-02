package chapter7.parallel_streams.reductions.collect;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.SortedSet;
import java.util.Set;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ConcurrentMap;

public class TestClass {
  public static void main(String[] args) {
    Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
    SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new,Set::add, Set::addAll);
    System.out.println(set);

    // Using the One-Argument collect() Method
    Stream<String> stream1 = Stream.of("w", "o", "l", "f").parallel();
    Set<String> set1 = stream1.collect(Collectors.toSet());
    System.out.println(set1);

    Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
    ConcurrentMap<Integer, String> map = ohMy.collect(Collectors.toConcurrentMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
    System.out.println(map);
    System.out.println(map.getClass());

    Stream<String> ohMy1 = Stream.of("lions", "tigers", "bears").parallel();
    ConcurrentMap<Integer, List<String>> map1 = ohMy1.collect(Collectors.groupingByConcurrent(String::length));
    System.out.println(map1);
    System.out.println(map1.getClass());
  }
}
