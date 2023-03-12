package chapter4.terminal_operations.collect;

import java.util.stream.Stream;
import java.util.TreeSet;

public class TestClass2 {
  public static void main(String[] args) {
    Stream<String> stream1 = Stream.of("w","o","l","f");
    TreeSet<String> set1 = stream1.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
    System.out.println(set1);
//    Stream<String> stream2 = Stream.of("w","o","l","f");
//    TreeSet<String> set2 = stream2.collect(TreeSet::new, TreeSet::add, TreeSet::add);
//    System.out.println(set2);
  }
}
