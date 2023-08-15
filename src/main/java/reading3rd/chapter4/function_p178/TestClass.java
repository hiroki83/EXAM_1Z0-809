package reading3rd.chapter4.function_p178;

import java.util.function.Function;
import java.util.function.BiFunction;

public class TestClass {
  public static void main(String ... args) {
    Function<String, Integer> f1 = String::length;
    Function<String, Integer> f2 = s -> s.length();

    System.out.println(f1.apply("cluck"));
    System.out.println(f2.apply("cluck"));



    BiFunction<String, String, String> b1 = String::concat;
    BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);

    System.out.println(b1.apply("baby", "chick"));
    System.out.println(b2.apply("baby", "chick"));
  }
}
