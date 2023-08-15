package reading3rd.chapter4.predicate_p177;

import java.util.function.Predicate;
import java.util.function.BiPredicate;

public class TestClass {
  public static void main(String ... args) {
    Predicate<String> p1 = String::isEmpty;
    Predicate<String> p2 = x -> x.isEmpty();

    System.out.println(p1.test(""));
    System.out.println(p2.test(""));


    BiPredicate<String, String> b3 = String::startsWith;
    BiPredicate<String, String> b4 = (string, prefix) -> string.startsWith(prefix);


    System.out.println(b3.test("chicken", "chick"));
    System.out.println(b4.test("chicken", "chick"));
  }
}
