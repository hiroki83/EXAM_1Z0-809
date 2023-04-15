package questions.chapter7.q3;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
//import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;

public class TestClass {
  //public static void main(String ... args) {
  public static void main(String ... args) throws InterruptedException, ExecutionException {
  //public static void main(String ... args) throws ExecutionException, InterruptedException {
    ExecutorService service = Executors.newSingleThreadScheduledExecutor();
    //ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
    //service.scheduleWithFixedDelay(() -> { // w1
    service.submit(() -> { // w1
      System.out.println("Open Zoo");
      //return null; // w2
      //return ; // w2
    //}, 0, 1, TimeUnit.MINUTES);
    });
    Future<?> result = service.submit(() -> System.out.println("Wake Staff")); // w3
    System.out.println(result.get()); // w4
  }
}
