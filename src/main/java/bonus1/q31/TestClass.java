package bonus1.q31;

import java.util.List;
import java.util.stream.Stream;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class TestClass {
  public static void main(String ... args) {
    Stream<Integer> prime = Stream.of(2,3,5,7);
    Stream<Integer> composite = Stream.of(4,6,8);
    //ConcurrentMap<Boolean, List<Integer>> data = Stream.combine(prime, composite)// DOES NOT COMPILE
    ConcurrentMap<Boolean, List<Integer>> data = Stream.of(prime, composite)
    //ConcurrentMap<Boolean, List<Integer>> data = Stream.concat(prime, composite)// DOES NOT COMPILE
      //.flatMap(s -> s).parallelStream()// DOES NOT COMPILE
      .flatMap(s -> s).parallel()
      .collect(Collectors.groupingByConcurrent(n -> (n%2)==0));
      //.collect(Collectors.groupingByConcurrent(n -> (((Integer) n)%2)==0));
    System.out.println(data.get(true).size()+" "+data.get(false).size());
  }
}
