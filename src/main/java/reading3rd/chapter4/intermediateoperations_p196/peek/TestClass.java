package reading3rd.chapter4.intermediateoperations_p196.peek;

import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
    long count = stream.filter(s -> s.startsWith("g")).peek(System.out::println).count();
    System.out.println(count);



    List<Integer> numbers = new ArrayList<>();
    List<Character> letters = new ArrayList<>();
    numbers.add(1);
    letters.add('a');
    Stream<List<?>> stream1 = Stream.of(numbers, letters);
    stream1.map(List::size).forEach(System.out::println);


    StringBuilder builder = new StringBuilder();
    Stream<List<?>> good = Stream.of(numbers, letters);
    good.peek(l -> builder.append(l)).map(List::size).forEach(System.out::println);
    System.out.println(builder);


    StringBuilder builder2 = new StringBuilder();
    Stream<List<?>> bad = Stream.of(numbers, letters);
    bad.peek(l -> l.remove(0)).map(List::size).forEach(System.out::println);
    System.out.println(builder2);
  }
}
