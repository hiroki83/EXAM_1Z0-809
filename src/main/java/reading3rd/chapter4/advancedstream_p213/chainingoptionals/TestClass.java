package reading3rd.chapter4.advancedstream_p213.chainingoptionals;

import java.util.Optional;
import java.io.IOException;
import java.util.function.Supplier;
import java.util.List;

class ChainingOptionals {
  static Optional<Integer> calculator(String s) {
    return Optional.of(s.length());
  }
}
public class TestClass {
  public static void threeDigit(Optional<Integer> optional) {
    if (optional.isPresent()) {
      Integer num = optional.get();
      String string = "" + num;
      if (string.length() == 3)
        System.out.println(string);
    }
  }
  public static void threeDigitEnhanced(Optional<Integer> optional) {
    optional.map(s -> ""+s)
      .filter(s -> s.length() >= 3)
      .ifPresent(System.out::println);
  }
  public static void displayLength(Optional<Integer> optional) {
    optional.map(i -> ""+i).map(String::length).ifPresent(System.out::println);
  }
  public static void main(String ... args) {
    threeDigit(Optional.empty());
    threeDigit(Optional.of(11));
    threeDigit(Optional.of(111));
    threeDigitEnhanced(Optional.empty());
    threeDigitEnhanced(Optional.of(11));
    threeDigitEnhanced(Optional.of(111));
    displayLength(Optional.empty());
    displayLength(Optional.of(11));
    displayLength(Optional.of(111));
    Optional<String> optional = Optional.of("Hiroki");
    //Optional<Integer> result = optional.map(ChainingOptionals::calculator); // DOES NOT COMPILE
    Optional<Integer> result = optional.flatMap(ChainingOptionals::calculator);
    result.ifPresent(System.out::println);

    try {
      ExceptionCaseStudy.create().stream().count();
      //Supplier<List<String>> s = ExceptionCaseStudy::create; // DOES NOT COMPILE
      Supplier<List<String>> s = () -> {
        try {
          return ExceptionCaseStudy.create();
        } catch(IOException e) {
          e.printStackTrace();
          throw new RuntimeException(e);
        }
      };
    } catch (IOException e) {
      e.printStackTrace();
    }
    Supplier<List<String>> s2 = ExceptionCaseStudyHelper::createSafe;
  }
}
