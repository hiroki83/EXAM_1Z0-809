package reading3rd.chapter4.optional_p184;

import java.util.Optional;

public class TestClass {
  private static Optional<Double> average(int ... scores) {
    Double total = null;
    if ( scores.length != 0)  {
      total = 0.0;
      for(Integer score : scores)
        total += score;
    }
    return total == null ? Optional.empty() : Optional.of(total/scores.length);
  }
  public static void main(String ... args) {
    Optional<Double> opt1 = average(90,100);
    opt1.ifPresent(System.out::println);

    Optional<Double> opt2 = average();
    System.out.println(opt2.orElse(Double.NaN));
    System.out.println(opt2.orElseGet(() -> Math.random()));
    System.out.println(opt2.orElseThrow(() -> new IllegalStateException()));

    //System.out.println(opt2.orElseGet(() -> new RuntimeException())); // DOES NOT COMPILE

    Optional<Double> opt3 = average(90, 100);
    System.out.println(opt3.orElse(Double.NaN));
    System.out.println(opt3.orElseGet(() -> Math.random()));
    System.out.println(opt3.orElseThrow(() -> new IllegalStateException()));
  }
}
