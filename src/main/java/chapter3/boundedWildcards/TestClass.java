package chapter3.boundedWildcards;
import java.util.List;
public class TestClass {
  public static long total(List<? extends Number> list) {
    long count = 0;
    for(Number number: list) {
      count+=number.longValue();
    }
    return count;
  }
}
