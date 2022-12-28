package chapter4.implementing_predicate;

import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;

public class TestClass2 {
  public static void main(String[] args) {
    Predicate<String> egg = s -> s.contains("egg");
    Predicate<String> brown = s -> s.contains("brown");
    Predicate<String> brownEggs = egg.and(brown);
    Predicate<String> otherEggs = egg.and(brown.negate());

    List<String> eggs = new ArrayList<>();
    eggs.add("egg");    
    eggs.add("brown egg");    
    eggs.add("white egg");    
    eggs.add("chicken");    

    System.out.println("brownEggs:");
    eggs.forEach(e -> System.out.println(brownEggs.test(e)));
    System.out.println("otherEggs:");
    eggs.forEach(e -> System.out.println(otherEggs.test(e)));
  }
}
