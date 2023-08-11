package reading3rd.chapter3.genericmethods_p114;

class Crate<T> {}
public class TestClass {
  public static <T> Crate<T> ship(T t) {
  //<T> public static Crate<T> ship(T t) {// COMPILE ERROR
  //public <T> static Crate<T> ship(T t) {// COMPILE ERROR
    System.out.println("Preparing " + t);
    return new Crate<T>();
  }
  public static void main(String ... args) {
    TestClass.ship(1234);
    TestClass.<String>ship("test1");
    TestClass.<String[]>ship(args);
  }
}
