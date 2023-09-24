package reading4th.chapter4.binaryoperatormethodreference_p193;

import java.util.stream.Stream;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class TestClass {
  public static void main(String ... args) {
    Supplier s1 = () -> new String();
    Supplier s2 = String::new;
    BinaryOperator<String> b1 = (str1, str2) -> str1.concat(str2);
    BinaryOperator<String> b2 = String::concat;
  }
}
