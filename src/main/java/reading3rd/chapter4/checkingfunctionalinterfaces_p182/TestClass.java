package reading3rd.chapter4.checkingfunctionalinterfaces_p182;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;
import java.util.List;

public class TestClass {
  public static void main(String ... args) {
    //Function<List<String>> ex1 = x -> x.get(0); // DOES NOT COMPILE
    Function<List<String>, String> ex1 = x -> x.get(0);
    //UnaryOperator<Long> ex2 = (Long l) -> 3.14; // DOES NOT COMPILE
    UnaryOperator<Long> ex2 = (Long l) -> 3_14L;
    //Predicate ex3 = String::isEmpty; // DOES NOT COMPILE
    Predicate<String> ex3 = String::isEmpty;
  }
}
