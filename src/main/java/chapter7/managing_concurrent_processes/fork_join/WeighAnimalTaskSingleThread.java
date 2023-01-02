package chapter7.managing_concurrent_processes.fork_join;

import java.util.List;
import java.util.Random;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.ForkJoinPool;

public class WeighAnimalTaskSingleThread extends RecursiveTask<Double> {
  private int start;
  private int end;
  private Double[] weights;

  public WeighAnimalTaskSingleThread(Double[] weights, int start, int end) {
    this.start = start;
    this.end = end;
    this.weights = weights;
  }

  protected Double compute() {
    if(end-start <= 3) {
      double sum = 0;
      for (int i=start; i<end; i++) {
        weights[i] = (double) new Random().nextInt(100);
//        System.out.println("Animal Weighted: "+i);
        sum += weights[i];
      }
      return sum;
    } else {
      int middle = start+((end-start)/2);
//      System.out.println("[start="+start+", middle="+middle+",end="+end+"]");
      RecursiveTask<Double> otherTask = new WeighAnimalTaskSingleThread(weights, start, middle);
      Double otherResult = otherTask.fork().join();
      return new WeighAnimalTaskSingleThread(weights, middle, end).compute() + otherResult;
    }
  }

  public static void main(String[] args) {
    Double[] weights = new Double[10000];
    ForkJoinTask<Double> task = new WeighAnimalTaskSingleThread(weights, 0, weights.length);
    ForkJoinPool pool = new ForkJoinPool();
    long start = System.currentTimeMillis();
    Double sum = pool.invoke(task);
    double time = (System.currentTimeMillis()-start)/1000.0;
    System.out.println(sum);

    // Print results
    System.out.println();
    System.out.println("Weights: ");
    Arrays.asList(weights).stream().forEach(d -> System.out.print(d.intValue()+" "));
    System.out.println("\nTasks completed in: "+time+" seconds");
  }
}
