package reading3rd.chapter3.computeif_p158;

import java.util.Map;
import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public class TestClass {
  public static void main(String ... args) {
    Map<String, Integer> counts = new HashMap<>();
    counts.put("Jenny", 1);

    BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
    Integer jenny = counts.computeIfPresent("Jenny", mapper);
    Integer sam = counts.computeIfPresent("Sam", mapper);
    System.out.println(counts);
    System.out.println(jenny);
    System.out.println(sam);

    Map<String, Integer> counts2 = new HashMap<>();
    counts2.put("Jenny", 15);
    counts2.put("Tom", null);

    Function<String, Integer> mapper2 = k -> 1;
    Integer jenny2 = counts2.computeIfAbsent("Jenny", mapper2);
    Integer sam2 = counts2.computeIfAbsent("Sam", mapper2);
    Integer tom2 = counts2.computeIfAbsent("Tom", mapper2);
    System.out.println(counts2);
    System.out.println(jenny2);
    System.out.println(sam2);
    System.out.println(tom2);

    Map<String, Integer> counts3 = new HashMap<>();
    counts3.put("Jenny", 30);
    counts3.put("Hiroki", null);

    counts3.computeIfPresent("Jenny", (k, v) -> null);
    counts3.computeIfPresent("Tom", (k, v) -> null);
    counts3.computeIfPresent("Hiroki", (k, v) -> null);
    counts3.computeIfAbsent("Sam", k -> null);
    System.out.println(counts3);
  }
}
