package chapter4.primitive_streams.advanced.collecting;


import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;
import java.util.TreeSet;

public class TestClass {
  public static void main(String[] args) {
    Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
    String result = ohMy.collect(Collectors.joining(","));
    System.out.println(result);
    Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
    int[] i = new int[1];
    //StringBuilder result2 = ohMy2.collect(StringBuilder::new, (a, b) -> a.append("," + b), StringBuilder::append);
    StringBuilder result2 = ohMy2.collect(StringBuilder::new
      , (a, b) -> { if (i[0]==0) a.append(b); else a.append("," + b); i[0]++;}, StringBuilder::append);
    System.out.println(result2);

    Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
    Double result3 = ohMy3.collect(Collectors.averagingInt(String::length));
    System.out.println(result3);

    Stream<String> ohMy4 = Stream.of("lions", "tigers", "bears");
    TreeSet<String> result4 = ohMy4.filter(s -> s.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));
    System.out.println(result4);

    Stream<String> ohMy5 = Stream.of("lions", "tigers", "bears");
    IntSummaryStatistics stats = ohMy5.mapToInt(String::length).summaryStatistics();
    Double result5 = (double) stats.getSum()/stats.getCount();
    System.out.println(result3);
    System.out.println(stats.getAverage());

  }
}
