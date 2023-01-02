package chapter7.creating_thread;

public class TestClass {
  public static void main(String[] args) {
    System.out.println("begin");
    (new ReadInventoryThread()).start();
    (new Thread(new PrintData())).start();
    (new ReadInventoryThread()).start();
    System.out.println("e n d");

    new PrintData().run();
    (new Thread(new PrintData())).run();
    (new ReadInventoryThread()).run();
  }
}
