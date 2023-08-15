package reading3rd.chapter4.functionalinterfacesdefaultmethod_p178;

import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;

public class TestClass {
  public static void main(String ... args) {
    Predicate<String> egg = s -> s.contains("egg");
    Predicate<String> brown = s -> s.contains("brown");

    Predicate<String> brownEgg1 = s -> s.contains("egg") && s.contains("brown");
    Predicate<String> otherEgg1 = s -> s.contains("brown") && ! s.contains("brown");

    Predicate<String> brownEgg2 = egg.and(brown);
    Predicate<String> otherEgg2 = egg.and(brown.negate());


    List<String> eggs = new ArrayList<>();
    eggs.add("egg");
    eggs.add("brown egg");
    eggs.add("white egg");
    eggs.add("spedial egg");
    for(String s : eggs) {
      System.out.println("egg      :" + egg.test(s));
      System.out.println("brown    :" + brown.test(s));
      System.out.println("brownEgg1:" + brownEgg1.test(s));
      System.out.println("otherEgg1:" + otherEgg1.test(s));
      System.out.println("brownEgg1:" + brownEgg2.test(s));
      System.out.println("otherEgg2:" + otherEgg2.test(s));
    }
  }
}
