package reading3rd.chapter7.thread_p331;

public class ReadInventoryThread extends Thread {
  public void run() {
    System.out.println("Printing zoo inventory");
  }
  public static void main(String[] args) {
    (new ReadInventoryThread()).start();
  }
}
