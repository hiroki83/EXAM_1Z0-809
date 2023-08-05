package reading3rd.chapter7.combiningresultreduce_p374;

import java.util.Arrays;

public class TestClass {
  public static void main(String ... args) {
    System.out.println(Arrays.asList('w', 'o', 'l', 'f')
      .stream()
      .reduce("", (s1, c) -> s1+c, (s2,s3) -> s2 + s3));
  }
}
