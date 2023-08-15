package reading3rd.chapter4.optional_p182;

import java.util.Optional;

public class TestClass {
  public static Optional<Double> average(int... scores) {
    if (scores.length == 0) return Optional.empty();
    int sum = 0;
    for (int score: scores) sum += score;
    return Optional.of((double) sum/scores.length);
  }
  public static Optional<Double> averageEnhancedVer1(int... scores) {
    Double value = null;
    if (scores.length != 0) {
      int sum = 0;
      for (int score: scores) sum += score;
      value = (double) sum/scores.length;
    }
    return value == null ? Optional.empty() : Optional.of(value);
  }
  public static Optional<Double> averageEnhancedVer2(int... scores) {
    Double value = null;
    if (scores.length != 0) {
      int sum = 0;
      for (int score: scores) sum += score;
      value = (double) sum/scores.length;
    }
    return Optional.ofNullable(value);
  }
  public static void main(String ... args) {
    System.out.println(average(90, 100));
    System.out.println(average());

    Optional<Double> opt = averageEnhancedVer1(90,100);
    if (opt.isPresent())
      System.out.println(opt.get());

    Optional<Double> opt2 = averageEnhancedVer2();
    System.out.println(opt2.get());// throw NoSuchElementException: No value present

    Optional<Double> opt3 = averageEnhancedVer2();
    if (opt3.isPresent())
      System.out.println(opt3.get());
  }
}
