package reading3rd.questions.chapter3.q13;

import java.util.*;

public class WildcardE {
  public void showSize(List<?> list) {
    System.out.println(list.size());
  }
  public static void main(String ... args) {
    WildcardE card = new WildcardE();
    Vector<? extends Number> list = new Vector<Integer>();
    card.showSize(list);
  }
}
