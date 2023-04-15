package questions.chapter7.q10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestClass2 {
  public static void main(String ... args) {
    List<String> list = Arrays.asList("test1", "test2", "test3");
    Stream<String> stream = list.parallelStream();
    Stream<String> stream2 = stream.parallel();
  }
}
