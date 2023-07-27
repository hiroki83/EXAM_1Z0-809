package reading3rd.chapter7.thread_p331;

public class TestClass {
  public static void main(String ... args) {
    System.out.println("begin");
    (new ReadInventoryThread()).start();
    (new Thread(new PrintData())).start();
    (new ReadInventoryThread()).start();
    System.out.println("end");
  }
}
