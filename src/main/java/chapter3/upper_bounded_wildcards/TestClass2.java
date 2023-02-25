package chapter3.upper_bounded_wildcards;

import java.util.List;
import java.util.ArrayList;

public class TestClass2 {
  static class Sparrow extends Bird {}
  static class Bird {}
  public static void main(String[] args) {
    List<? extends Bird> birds = new ArrayList<Bird>();
    //birds.add(new Sparrow());// DOES NOT COMPILE 
    //birds.add(new Bird());// DOES NOT COMPILE 
    List<Bird> birds2 = new ArrayList<Bird>();
    birds2.add(new Sparrow());// DOES NOT COMPILE 
    birds2.add(new Bird());// DOES NOT COMPILE 
  }
}
