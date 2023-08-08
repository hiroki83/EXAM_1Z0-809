// Sybex 829(coderanch: https://coderanch.com/t/775797/certification/Sybex-errata-Ch-Concurrency-review#3546766)
package reading3rd.questions.chapter7.q03;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;

public class TestClass2 {
  public static void main(String ... args) throws InterruptedException, ExecutionException {
    //ExecutorService service =   // w1 DOES NOT COMPILE
    ScheduledExecutorService service =   // w1
      Executors.newSingleThreadScheduledExecutor();
    service.scheduleWithFixedDelay(() -> {
        System.out.println("Open Zoo");
        //return null;   // w2
      }, 0, 1, TimeUnit.MINUTES);
    Future<?> result = service.submit(() ->   // w3
    System.out.println("Wake Staff"));
  }
}
