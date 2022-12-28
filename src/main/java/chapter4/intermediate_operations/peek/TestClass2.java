package chapter4.intermediate_operations.peek;

import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

public class TestClass2 {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    List<Character> letters = new ArrayList<>();

    numbers.add(1);
    letters.add('a');

    Stream<List<?>> stream = Stream.of(numbers, letters);
    stream.map(List::size).forEach(System.out::println);

    StringBuilder builder = new StringBuilder();
    Stream<List<?>> good = Stream.of(numbers, letters);
    good.peek(l -> builder.append(l)).map(List::size).forEach(System.out::println);
    System.out.println(builder);

    Stream<List<?>> bad = Stream.of(numbers, letters);
    bad.peek(l -> l.remove(0)).map(List::size).forEach(System.out::println);
  }
}
