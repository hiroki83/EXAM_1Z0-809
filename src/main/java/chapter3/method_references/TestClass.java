package chapter3.method_references;

import java.util.*;
import java.util.function.*;
import chapter3.comparator.Duck;

public class TestClass {
  public static void main(String[] args) {
    //Comparator<Duck> byWeight = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);
    Comparator<Duck> byWeight = DuckHelper::compareByWeight;
    Consumer<List<Integer>> methodRef1 = Collections::sort;
    Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);
    String str = "abc";
    Predicate<String> methodRef2 = str::startsWith;
    Predicate<String> lambda2 = s -> str.startsWith(s);

    //Predicate<String> methodRef2_1 = String::startsWith;//DOES NOT COMPILE
    Predicate<String> lambda2_1 = s -> str.startsWith(s);

    Predicate<String> methodRef3 = String::isEmpty;
    Predicate<String> lambda3 = s -> s.isEmpty();
    Supplier<ArrayList> methodRef4 = ArrayList::new;
    Supplier<ArrayList> lambda4 = () -> new ArrayList();
  }
}
