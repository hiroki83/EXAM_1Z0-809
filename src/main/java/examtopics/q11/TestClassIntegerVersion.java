package examtopics.q11;

import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.List;

public class TestClassIntegerVersion {
  public static void main(String ... args) {
    Stream<List<String>> iStr = Stream.of(Arrays.asList("1","Jhon"), Arrays.asList("1", null));
    //Stream<List<Integer>> iStr = Stream.of(Arrays.asList(1,100), Arrays.asList(1, null));
    IntStream nlnSt = iStr.flatMapToInt(l -> l.stream().mapToInt(Integer::new));
    nlnSt.forEach(System.out::print);
  }
}
