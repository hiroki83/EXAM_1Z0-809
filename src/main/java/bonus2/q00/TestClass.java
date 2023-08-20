package bonus2.q00;

import java.util.stream.Stream;

public class TestClass {
  public static void main(String ... args) {
    // increment intermediate pipeline
    Stream<Integer> first = Stream.of(10,20,30);
    Stream<Integer> second = Stream.of(40,50,60);
    first.map(i -> i++).forEach(System.out::println);
    second.map(i -> ++i).forEach(System.out::println);

    // lambdas define variable compile error
    String str = "Hello";
    Stream<Integer> s1 = Stream.of(1, 2, 3);
    Stream<Integer> s2 = Stream.of(4, 5, 6);
    Stream<Integer> s3 = Stream.of(7, 8, 9);
    //s1.forEach(s1 -> System.out.println(s1)); // DOES NOT COMPILE
    //s2.forEach(s -> { int s1 = 0; System.out.println(s);}); // DOES NOT COMPILE
    //s3.forEach(str -> System.out.println(str)); // DOES NOT COMPILE
    s1.forEach(i -> System.out.println(str + i));
  }
}
