package reading3rd.questions.chapter3.q13;

import java.util.*;

public class WildcardC {
  public void showSize(List<?> list) {
    System.out.println(list.size());
  }
  public static void main(String ... args) {
    WildcardC card = new WildcardC();
    //List<?> list = new ArrayList<?>();// DOES NOT COMPILE
    List<?> list = new ArrayList<>();
    card.showSize(list);
  }
}
