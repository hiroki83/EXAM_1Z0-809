package reading3rd.chapter3.interactinglegacycode_p115;

import java.util.List;
import java.util.ArrayList;

public class LegacyAutoboxing {
  public static void main(String ... args) {
    List numbers = new ArrayList();
    numbers.add(5);
    //int result = numbers.get(0);// DOES NOT COMPILE
    int result = (Integer) numbers.get(0);
  }
}
