package reading3rd.chapter7.forkjoin_p382;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.Arrays;

public class TestClassRecursiveAction {
  public static void main(String ... args) {
    Double[] weights = new Double[10];

    ForkJoinTask<?> task = new WeighAnimalAction(weights,0,weights.length);
    ForkJoinPool pool = new ForkJoinPool();
    pool.invoke(task);

    // Print results
    System.out.println();
    System.out.print("Weights: ");
    Arrays.asList(weights).stream().forEach(d -> System.out.print(d.intValue()+" "));
  }
}
