package bonus3.q16;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.stream.LongStream;

public class TestClass {
  public static void main(String ... args) {
    long l = 1;
    //Long L = 1; // DOES NOT COMPILE
    //int i = 1L; // DOES NOT COMPILE
    ExecutorService service = Executors.newScheduledThreadPool(10);
    LongStream.of(101, 704,1126) // p1
      //.forEach(() -> service.submit( // p2 // DOES NOT COMPILE
      //  c -> System.out.println(2+c))); // p3
      .forEach(c -> service.submit( // p2
        () -> System.out.println(2+c))); // p3
    service.submit(() -> System.out.println("Happy Holidays!")); // p4
  }
}
