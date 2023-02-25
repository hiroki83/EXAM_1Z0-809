package questions.chapter3.q13;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Vector;

public class Wildcard5 {
  public void showSize(List<?> list) {
    System.out.println(list.size());
  }
  public static void main(String[] args) {
    Wildcard5 card = new Wildcard5();
    Vector<? extends Number> list = new Vector<Integer>();
    card.showSize(list);
  }
}
