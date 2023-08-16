package reading3rd.questions.chapter4.q11;

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class TestClass {
  public static void main(String ... args) {
    //Stream.iterate(1, x -> x++).limit(5).map(x -> x).collect(Collectors.joining());
    Stream.iterate(1, x -> x++).limit(5).map(x -> "" + x).collect(Collectors.joining());
    System.out.println(Stream.iterate(1, x -> x++).limit(5).map(x -> "" + x).collect(Collectors.joining())); // 11111
    System.out.println(Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining())); // 12345
    System.out.println(Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining("")));
  }
}
