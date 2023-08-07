package reading3rd.chapter7.forkjoin_p382;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.ForkJoinPool;

public class TestClassRecursiveTask {
  public static void main(String ... args) {
    Double[] weights = new Double[10];
    ForkJoinTask<Double> task = new WeighAnimalTask(weights,0,weights.length);
    ForkJoinPool pool = new ForkJoinPool();
    Double sum = pool.invoke(task);
    System.out.println("Sum: "+sum);
  }
}
