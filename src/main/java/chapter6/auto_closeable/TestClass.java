package chapter6.auto_closeable;

//import java.util.AutoCloseable;

public class TestClass implements AutoCloseable {
  public void close() {
    System.out.println("Close gate");
  }
  public static void main(String[] args) {
    try (TestClass t = new TestClass()) {
      System.out.println("put turkeys in");
    }
  }
}
