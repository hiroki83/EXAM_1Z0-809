package reading3rd.questions.chapter7.q13;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class TestClass2 {
  public static void main(String ... args) {
    Stream<String> cats = Stream.of("leopard","lynx","ocelot","puma").parallel();
    System.out.println(cats.isParallel());
    Stream<String> bears = Stream.of("panda","grizzly","polar").parallel();
    System.out.println(bears.isParallel());
    Stream<String> dogs = Stream.of("akita","shiba","shiba").parallel();
    System.out.println(cats.isParallel());
    //Stream<String> data = Stream.of(cats,bears)
    //  .flatMap(s -> s);
    //System.out.println(data.isParallel());
    //Stream<String> data = cats
    //  .skip(1);
    //System.out.println(data.isParallel()+" "+data.count());
    Stream<String> data = dogs
      .distinct();
    System.out.println(data.isParallel()+" "+data.count());
  }
}
