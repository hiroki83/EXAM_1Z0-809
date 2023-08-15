package reading3rd.chapter4.advancedstream_p213.maps;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> ohMy = Stream.of("tigers", "lions", "bears");
    Map<String, Integer>  map = ohMy.collect(Collectors.toMap(s -> s, String::length));
    System.out.println(map);

    Stream<String> ohMy1 = Stream.of("tigers", "lions", "bears");
    Map<String, Integer>  map1 = ohMy1.collect(Collectors.toMap(Function.identity(), String::length));
    System.out.println(map1);


    Stream<String> ohMy2 = Stream.of("tigers", "lions", "bears");
    try {
      Map<Integer, String>  map2 = ohMy2.collect(Collectors.toMap(String::length, Function.identity()));
      System.out.println(map2);// throw IllegalStateException
    } catch (Exception e) {
      System.out.println("catch Exception");
      e.printStackTrace();
    }


    Stream<String> ohMy3 = Stream.of("tigers", "lions", "bears");
    Map<Integer, String>  map3 = ohMy3.collect(Collectors.toMap(String::length, Function.identity(), (s1, s2) -> s1 + "," +s2));
    System.out.println(map3);
    System.out.println(map3.getClass());


    Stream<String> ohMy4 = Stream.of("tigers", "lions", "bears");
    Map<Integer, String>  map4 = ohMy4.collect(Collectors.toMap(String::length, Function.identity(), (s1, s2) -> s1 + "," +s2, TreeMap::new));
    System.out.println(map4);
    System.out.println(map4.getClass());
  }
}
