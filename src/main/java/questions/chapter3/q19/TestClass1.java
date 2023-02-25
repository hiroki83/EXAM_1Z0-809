package questions.chapter3.q19;

import java.util.List;
import java.util.LinkedList;

public class TestClass1 {
  public static void main(String[] args) {
    List<Integer> q = new LinkedList<>();
    q.add(10);
    q.add(12);
    q.remove(1);
    System.out.print(q);
  }
}

