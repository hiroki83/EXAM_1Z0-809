package bonus3.q52;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.ForkJoinPool;

public class CheckWeather extends RecursiveTask { // j1
  private int start;
  private int end;
  public CheckWeather ( int start, int end) {
    this.start = start;
    this.end = end;
  }
  //protected void compute() { // j2
  //  if((end-start)<2)
  //    return;
  //  else {
  //    int middle = start + ((end-start)/2);
  //    invokeAll(new CheckWeather(start, middle), new CheckWeather(middle, end)); // j3
  //  }
  //}
  @Override
  protected Object compute() {
    return null;
  }
  
  public static void main(String ... args) {
    ForkJoinTask task = new CheckWeather(0, 4);
    ForkJoinPool pool = new ForkJoinPool();
    pool.invoke(task);
  }
}
