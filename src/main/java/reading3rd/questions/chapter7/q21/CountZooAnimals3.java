package reading3rd.questions.chapter7.q21;

import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class CountZooAnimals3 {
  public static Integer performCount(int exhibitNumber) {
    // IMPLEMENTATION OMITTED
    System.out.println("when does execute this method?");
    throw new RuntimeException("fake exception");
  }

  public static void printResults(Future<?> f) {
    try {
      System.out.println(f.get()); // o1
    } catch(Exception e) {
      System.out.println("Exception!");
    }
  }
  public static void main(String ... args) throws InterruptedException, ExecutionException {
    ExecutorService service = Executors.newSingleThreadExecutor();
    final List<Future<?>> results = new ArrayList<>();
    IntStream.range(0,10)
      .forEach(i -> results.add(
         service.submit(() -> performCount(i)))); // o2
    Thread.sleep(1000);
    results.stream().forEach(f -> printResults(f));
    service.shutdown();
  }
}
