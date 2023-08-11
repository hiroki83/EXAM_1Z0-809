package reading3rd.chapter3.upperboundedwildcards_p119;

import java.util.List;
import java.util.ArrayList;

public class TestClass2 {
  static class Sparrow extends Bird {}
  static class Bird {}
  public static void main(String ... args) {
    List<? extends Bird> birds = new ArrayList<Bird>();
    //birds.add(new Sparrow());// DOES NOT COMPILE
    //birds.add(new Bird());// DOES NOT COMPILE
  }
}
