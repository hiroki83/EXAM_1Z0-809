package questions.chapter7.q21;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class CountZooAnimals {
  public static Integer performCount(int exhibitNumber) {
    //return null;
    //return exhibitNumber;
    //throw new RuntimeException("thrown exception manualy");
    while(true) {
      exhibitNumber++;
    }
  }

  public static void printResults(Future<?> f) {
    try {
      System.out.println(f.get(1, TimeUnit.SECONDS)); // o1
      //System.out.println(f.get()); // o1
    } catch (Exception e) {
      //System.out.println(e.getMessage());
      System.out.println("Exception!");
    }
  }

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService service = Executors.newSingleThreadExecutor();
    final List<Future<?>> results = new ArrayList<>();
    IntStream.range(0, 10)
      .forEach(i -> results.add(
        service.submit(() -> performCount(i)))); // o2
      //.forEach(i -> results.add(
      //  service.submit(() -> {System.out.println("test" + i); return performCount(i);}))); // o2
    results.stream().forEach(f -> printResults(f));
    service.shutdown();
  }
}
