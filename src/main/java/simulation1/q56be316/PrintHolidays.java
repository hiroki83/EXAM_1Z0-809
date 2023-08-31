package simulation1.q56be316;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.stream.LongStream;

public class PrintHolidays {
  public static void main(String ... args) {
    ExecutorService service = Executors.newScheduledThreadPool(10);
    LongStream.of(101, 704, 1126) // p1
      //.forEach(() -> service.submit( // p2 DOES NOT COMPILE
      .forEach(c -> service.submit(
        //c -> System.out.println(2+c))); // p3 DOES NOT COMPILE
        () -> System.out.println(2+c)));
    service.submit(() -> System.out.println("Happy Holidays!")); // p4
  }
}
