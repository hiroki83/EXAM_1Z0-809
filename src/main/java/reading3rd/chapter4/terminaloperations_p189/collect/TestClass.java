package reading3rd.chapter4.terminaloperations_p189.collect;

import java.util.stream.Stream;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> stream0 = Stream.of("w","o","l","f");
    StringBuilder word0 = stream0.collect(() -> new StringBuilder(), (s1, s2) -> s1.append(s2), (s1, s2) -> s1.append(s2));
    System.out.println(word0);

    Stream<String> stream1 = Stream.of("w","o","l","f");
    StringBuilder word1 = stream1.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
    System.out.println(word1);


    Stream<String> stream2 = Stream.of("w","o","l","f");
    TreeSet<String> set = stream2.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
    System.out.println(set);


    Stream<String> stream3 = Stream.of("w","o","l","f");
    TreeSet<String> set3 = stream3.collect(Collectors.toCollection(TreeSet::new));
    System.out.println(set3);


    Stream<String> stream4 = Stream.of("w","o","l","f");
    Set<String> set4 = stream4.collect(Collectors.toSet());
    System.out.println(set4);
  }
}
