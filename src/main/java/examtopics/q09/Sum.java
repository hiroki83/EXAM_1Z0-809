package examtopics.q09;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;

public class Sum extends RecursiveAction { // line n1
  static final int THRESHOLD_SIZE = 3;
  int start, end;
  int [] data;
  public Sum(int[] data, int start, int end) {
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
      new Sum(data, start + THRESHOLD_SIZE, end).fork();
      new Sum(data, start, Math.min(end, start + THRESHOLD_SIZE)).compute();
    }
  }
  public static void main(String ... args) {
    ForkJoinPool fjPool = new ForkJoinPool();
    int data[] = {1,2,3,4,5,6,7,8,9,10};
    double start = System.currentTimeMillis();
    fjPool.invoke(new Sum(data, 0, data.length));
    double time = System.currentTimeMillis()-start;
    System.out.println(time);
  }
}
