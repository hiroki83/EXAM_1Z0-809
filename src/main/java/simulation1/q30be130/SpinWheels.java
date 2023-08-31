package simulation1.q30be130;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.ForkJoinPool;

public class SpinWheels extends RecursiveTask { // k1
  private int a;
  private int c;
  public SpinWheels(int a, int c) {
    this.a = a;
    this.c = c;
  }
  protected Object compute() { // k2
    if (a <= 0) return 10;
    else {
      int b = a + ((a - c)/2);
      invokeAll(new SpinWheels(a, b), new SpinWheels(b, c)); // k3
      return ""; // k4
    }
  }
  public static void main(String ... args) {
    //ForkJoinTask task = new SpinWheels(0, 100);
    ForkJoinTask task = new SpinWheels(1, 100);
    ForkJoinPool pool = new ForkJoinPool();
    //int x = (Integer) pool.invoke(task); // k5
    pool.invoke(task); // k5
    //System.out.println(x);
  }
}
