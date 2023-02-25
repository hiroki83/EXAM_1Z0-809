package questions.chapter3.q13;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class Wildcard4 {
  public void showSize(List<?> list) {
    System.out.println(list.size());
  }
  public static void main(String[] args) {
    Wildcard4 card = new Wildcard4();
    //List<Exception> list = new LinkedList<java.io.IOException>();// COMPILE ERROR
    List<? extends Exception> list = new LinkedList<java.io.IOException>();
    card.showSize(list);
  }
}
