package reading3rd.chapter7.polling_p334;

public class CheckResultsWithSleep {
  private static int counter = 0;
  public static void main(String ... args) throws InterruptedException {
    new Thread(() -> {
      for(int i=0; i<500; i++) CheckResultsWithSleep.counter++;
    }).start();
    while(CheckResultsWithSleep.counter<100) {
      System.out.println("Not reached yet");
      Thread.sleep(1000); // 1 SECOND
    }
    System.out.println("Reached!");
  }
}
