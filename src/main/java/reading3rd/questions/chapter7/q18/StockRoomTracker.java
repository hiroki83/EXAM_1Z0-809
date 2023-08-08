package reading3rd.questions.chapter7.q18;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;
import java.util.stream.IntStream;

public class StockRoomTracker {
  public static void await(CyclicBarrier cb) { // j1
    try {
      cb.await();
    } catch (InterruptedException | BrokenBarrierException e) {
      e.printStackTrace();
    }
  }

  public static void main(String ... args) {
    CyclicBarrier cb = new CyclicBarrier(10,
      () -> System.out.println("Stock Room Full!")); // j2
    //IntStream.iterate(1, i -> 1).limit(9).parallel().forEach(i -> await(cb)); // j3
    IntStream.iterate(1, i -> 1).limit(11).parallel().forEach(i -> await(cb)); // the program still hang, since the JVM does not allocate 10 threads to the parallel stream.
  }
}
