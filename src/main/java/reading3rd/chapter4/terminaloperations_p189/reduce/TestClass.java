package reading3rd.chapter4.terminaloperations_p189.reduce;

import java.util.stream.Stream;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class TestClass {
  public static void main(String ... args) {
    String[] array = new String[] {"w", "o", "l", "f"};
    String result = "";
    for (String s: array) result = result + s;
    System.out.println(result);

    Stream<String> stream1 = Stream.of("w","o","l","f");
    String word1 = stream1.reduce("", (s, c) -> s + c);
    System.out.println(word1);

    Stream<String> stream2 = Stream.of("w","o","l","f");
    String word2 = stream2.reduce("", String::concat);
    System.out.println(word2);

    Stream<Integer> stream3 = Stream.of(3,5,6);
    System.out.println(stream3.reduce(1, (a,b) -> a*b));

    Stream<Integer> stream4 = Stream.of(3,5,6);
    Optional<Integer> opt = stream4.reduce((a,b) -> a*b);
    opt.ifPresent(System.out::println);


    BinaryOperator<Integer> op = (a,b) -> a * b;
    Stream<Integer> empty = Stream.empty();
    Stream<Integer> oneElement = Stream.of(3);
    Stream<Integer> threeElements = Stream.of(3,5,6);

    empty.reduce(op).ifPresent(System.out::println);
    oneElement.reduce(op).ifPresent(System.out::println);
    threeElements.reduce(op).ifPresent(System.out::println);


    BinaryOperator<Integer> op2 = (a,b) -> a * b;
    Stream<Integer> stream5 = Stream.of(3,5,6);
    System.out.println(stream5.reduce(1, op, op));
  }
}
