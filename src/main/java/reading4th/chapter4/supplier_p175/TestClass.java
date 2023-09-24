package reading4th.chapter4.supplier_p175;

import java.util.function.Supplier;
import java.util.ArrayList;

public class TestClass {
  public static void main(String ... args) {
    Supplier<ArrayList<String>> s1 = ArrayList<String>::new;
    //Supplier<ArrayList<String>> s2 = ArrayList<>::new; // DOES NOT COMPILE
    ArrayList<String> a1 = new ArrayList<>();
  }
}
