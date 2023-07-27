package reading3rd.chapter7.thread_p331;

public class TestClass2 {
  public static void main(String ... args) {
    System.out.println("begin");
    new ReadInventoryThread().run();
    new Thread(new PrintData()).run();
    new PrintData().run();
    System.out.println("end");
  }
}
