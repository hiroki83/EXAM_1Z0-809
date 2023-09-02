package examtopics.q09;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Sum2 extends RecursiveAction { // line n1
  static final int THRESHOLD_SIZE = 3;
  int start, end;
  int [] data;
  public Sum2(int[] data, int start, int end) {
    this.data = data;
    this.start = start;
    this.end = end;
  }

  protected void compute() {
    int sum = 0;
    if (end - start <= THRESHOLD_SIZE) {
      for (int i = start; i < end; i++) {
        sum += data[i];
      }
      System.out.println(sum);
    } else {
      invokeAll(
        new Sum2(data, start + THRESHOLD_SIZE, end),
        new Sum2(data, start, Math.min(end, start + THRESHOLD_SIZE))
      );
    }
  }
  public static void main(String ... args) {
    int data[] = {1,2,3,4,5,6,7,8,9,10};
    ForkJoinTask<?> action = new Sum2(data, 0, data.length);
    ForkJoinPool fjPool = new ForkJoinPool();
    double start = System.currentTimeMillis();
    fjPool.invoke(action);
    double time = System.currentTimeMillis()-start;
    System.out.println(time);
  }
}
