package chapter4.advancedstream.chaining;

import java.util.Optional;

public class TestClass {
  public static void main(String[] args) {
    treeDigitOldStyle(Optional.empty());
    treeDigitOldStyle(Optional.of(4));
    treeDigitOldStyle(Optional.of(123));
    treeDigit(Optional.empty());
    treeDigit(Optional.of(4));
    treeDigit(Optional.of(123));
  }

  private static void treeDigitOldStyle(Optional<Integer> optional) {
    if (optional.isPresent()) {
      Integer num = optional.get();
      String string = "" + num;
      if (string.length() == 3) System.out.println(string);
    }
  }
  private static void treeDigit(Optional<Integer> optional) {
    optional.map(n -> "" + n).filter(s -> s.length() == 3).ifPresent(System.out::println);
    Optional<Integer> result = optional.map(n -> "" + n).map(String::length);
    result.ifPresent(System.out::println);
    //Optional<Integer> result1 = optional.map(n -> "" + n).map(ChainingOptionals::calculator);
    Optional<Integer> result1 = optional.map(n -> "" + n).flatMap(ChainingOptionals::calculator);
    result1.ifPresent(System.out::println);
  }
}
