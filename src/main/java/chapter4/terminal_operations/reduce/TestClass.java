package chapter4.terminal_operations.reduce;

import java.util.stream.Stream;
import java.util.function.BinaryOperator;

public class TestClass {
  public static void main(String[] args) {
    String[] array = new String[] {"w", "o", "l", "f"};
    String result = "";
    for (String s : array) result = result + s;
    System.out.println(result);

    Stream<String> stream1 = Stream.of("w", "o", "l", "f");
    String word1 = stream1.reduce("", (s, c) -> s + c);
    System.out.println(word1);
    Stream<String> stream2 = Stream.of("w", "o", "l", "f");
    String word2 = stream2.reduce("", String::concat);
    System.out.println(word2);

    Stream<Integer> stream3 = Stream.of(3, 5, 6);
    System.out.println(stream3.reduce(1, (a, b) -> a*b));

    BinaryOperator<Integer> op = (a, b) -> a * b;
    Stream<Integer> empty = Stream.empty();
    Stream<Integer> oneElement = Stream.of(3);
    Stream<Integer> threeElements = Stream.of(3, 5, 6);

    System.out.println("return Optional");
    //System.out.println(empty.findAny());
    //System.out.println(oneElement.findAny());
    //System.out.println(threeElements.findAny());
    empty.reduce(op).ifPresent(System.out::println);
    oneElement.reduce(op).ifPresent(System.out::println);
    //if(oneElement.reduce(op).ifPresent()) System.out.println("oneElement");
    //oneElement.reduce(op).get();
    threeElements.reduce(op).ifPresent(System.out::println);
    //if(threeElements.reduce(op).ifPresent()) System.out.println("threeElements");
    //threeElements.reduce(op).get();

    System.out.println("Parallel");
    BinaryOperator<Integer> op1 = (a, b) -> a * b;
    Stream<Integer> stream4 = Stream.of(3, 5, 6);
    System.out.println(stream4.reduce(1, op1, op1));
  }
}
