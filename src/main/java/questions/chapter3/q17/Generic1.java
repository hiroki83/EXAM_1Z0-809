package questions.chapter3.q17;

public class Generic1<T> {
  public static void main(String[] args) {
    Generic1<String> g1 = new Generic1<>();
    Generic1<Object> g2 = new Generic1();
  }
}
