package chapter3.generic_methods;

public class TestClass {
  public static void main(String[] args) {
    TestClass testClass = new TestClass();
    Crate<Integer> test = testClass.<Integer>ship(1);
  }

  public static <T> Crate<T> ship(T t) {
    System.out.println("Preparing " + t);
    return new Crate<T>();
  }
}
