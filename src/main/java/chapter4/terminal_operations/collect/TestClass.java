package chapter4.terminal_operations.collect;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.TreeSet;
import java.util.Set;

public class TestClass {
  public static void main(String[] args) {
    //Stream<String> stream = Stream.of("w", "o", "l", "f");
    Stream<String> stream = Stream.of("m", "o", "n", "k", "e", "y");
    StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
    System.out.println(word);

    //Stream<String> stream2 = Stream.of("w", "o", "l", "f");
    Stream<String> stream2 = Stream.of("m", "o", "n", "k", "e", "y");
    TreeSet<String> set = stream2.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
    System.out.println(set);

    //Stream<String> stream3 = Stream.of("w", "o", "l", "f");
    Stream<String> stream3 = Stream.of("m", "o", "n", "k", "e", "y");
    stream3.forEach(System.out::println);

    Stream<String> stream4 = Stream.of("m", "o", "n", "k", "e", "y");
    TreeSet<String> set2 = stream4.collect(Collectors.toCollection(TreeSet::new));
    System.out.println(set2);

    Stream<String> stream5 = Stream.of("m", "o", "n", "k", "e", "y");
    Set<String> set3 = stream5.collect(Collectors.toSet());
    System.out.println(set3);
  }
}
