package reading3rd.chapter4.unaryoperator_p180;

import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public class TestClass {
  public static void main(String ... args) {
    UnaryOperator<String> u1 = String::toUpperCase;
    UnaryOperator<String> u2 = x -> x.toUpperCase();

    System.out.println(u1.apply("chirp"));
    System.out.println(u2.apply("chirp"));


    BinaryOperator<String> b1 = String::concat;
    BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);

    System.out.println(b1.apply("bacy ","chick"));
    System.out.println(b2.apply("bacy ","chick"));
  }
}
