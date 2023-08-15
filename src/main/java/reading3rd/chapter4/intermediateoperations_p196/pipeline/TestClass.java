package reading3rd.chapter4.intermediateoperations_p196.pipeline;

import java.util.stream.Stream;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestClass {
  public static void main(String ... args) {
    List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
    List<String> filtered = new ArrayList<>();
    for (String name: list) {
      if (name.length() == 4) filtered.add(name);
    }
    Collections.sort(filtered);
    Iterator<String> iter = filtered.iterator();
    if(iter.hasNext()) System.out.println(iter.next());
    if(iter.hasNext()) System.out.println(iter.next());


    List<String> list2 = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
    list2.stream().filter(s -> s.length() == 4).sorted().limit(2).forEach(System.out::println);


    Stream.generate(() -> "Elsa")
      .filter(n -> n.length() == 4)
      .limit(2)
      .sorted()
      .forEach(System.out::println);


    Stream<Integer> infinite1 = Stream.iterate(1, x -> x + 1);
    infinite1.limit(5)
      .filter(x -> x % 2 == 1)
      .forEach(System.out::print);
    System.out.println();


    Stream<Integer> infinite2 = Stream.iterate(1, x -> x + 1);
    infinite2.limit(5)
      .peek(System.out::print)
      .filter(x -> x % 2 == 1)
      .forEach(System.out::print);
    System.out.println();


    Stream<Integer> infinite3 = Stream.iterate(1, x -> x + 1);
    infinite3
      .filter(x -> x % 2 == 1)
      .limit(5)
      .forEach(System.out::print);
    System.out.println();


    Stream<Integer> infinite4 = Stream.iterate(1, x -> x + 1);
    infinite4
      .filter(x -> x % 2 == 1)
      .peek(System.out::print)
      .limit(5)
      .forEach(System.out::print);
    System.out.println();
  }
}
