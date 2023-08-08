package reading3rd.questions.chapter7.q10;

import java.util.Arrays;

public class TestClass {
  public static void main(String ... args) {
    System.out.println(Arrays.asList("duck","chicken","flamingo","pelican")
      .parallelStream().parallel()
      //.reduce(0,
      .reduce("",
        //(c1, c2) -> c1.length() + c2.length(), // q2
        (c1, c2) -> c1 + c2, // q2
        (s1, s2) -> s1 + s2)); // q3
        //(s1, s2) -> s1.length() + s2.length())); // q3
    System.out.println(Arrays.asList("duck","chicken","flamingo","pelican")
      .parallelStream().parallel()
      .mapToInt(String::length)
      .sum());
  }
}
