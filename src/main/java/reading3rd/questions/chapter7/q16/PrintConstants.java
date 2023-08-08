package reading3rd.questions.chapter7.q16;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.stream.DoubleStream;

public class PrintConstants {
  public static void main(String ... args) {
    //ExecutorService service = null;
    //try {
      //service = Executors.newScheduledThreadPool(10);
      ExecutorService service = Executors.newScheduledThreadPool(10);
      DoubleStream.of(3.14159, 2.71828) // b1
        .forEach(c -> service.submit( // b2
          () -> System.out.println(10*c)));
      service.execute(() -> System.out.println("Printed")); // b4
    //} finally {
    //  if(service!=null) service.shutdown();
    //}
  }
}
