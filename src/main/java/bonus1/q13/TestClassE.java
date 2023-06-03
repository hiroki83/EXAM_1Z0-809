package bonus1.q13;

import java.util.List;

public class TestClassE {
  public static void main(String ... args) {
    
  }
  public static void add(List<? super Number> list) {
    list.add(123);
  }
}
