package bonus2.q54;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class ContestAppI {
  public static Object trackParticipants (int count) throws Exception {
    // IMPLEMENTATION OMITTED
    throw new Exception();
  }
  public static void viewWinners(Future<?> f) {
    try {
      //System.out.println(f.get(100)); // a1 DOES NOT COMPILE
      System.out.println(f.get()); // a1
    } catch(Exception e) {
      System.out.println("No Winner");
    }
  }
  public static void main(String ... args) throws InterruptedException, ExecutionException {
    ExecutorService service = Executors.newSingleThreadExecutor();
    final List<Future<?>> results = new ArrayList<Future<?>>();
    IntStream.range(100, 105)
      //.forEach(i -> results.add(service.submit(p -> trackParticipants(i)))); // a2 DOES NOT COMPILE
      .forEach(i -> results.add(service.submit(() -> trackParticipants(i)))); // a2
    results.stream().forEach(f -> viewWinners(f));
    service.shutdown();
  }
}
