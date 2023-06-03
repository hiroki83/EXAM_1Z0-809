package bonus1.q13;

import java.util.List;

public class TestClassF {
  public static void main(String ... args) {
    
  }
  //public static void add(List<? implements Number> list) {// DOES NOT COMPILE
  public static void add(List list) {
    list.add(123);
  }
}
