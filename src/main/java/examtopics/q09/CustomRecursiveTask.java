package examtopics.q09;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.ForkJoinPool;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.concurrent.Future;

public class CustomRecursiveTask extends RecursiveTask<Integer> {

  private int[] arr;

  private static final int THRESHOLD = 20;

  public CustomRecursiveTask(int[] arr) {
    this.arr = arr;
  }

  @Override
  protected Integer compute() {
    if (arr.length > THRESHOLD) {
      return ForkJoinTask.invokeAll(createSubtasks())
               .stream()
               .mapToInt(ForkJoinTask::join)
               .sum();
    } else {
      return processing(arr);
    }
  }

  private Collection<CustomRecursiveTask> createSubtasks() {
    List<CustomRecursiveTask> dividedTasks = new ArrayList<>();
    dividedTasks.add(new CustomRecursiveTask(Arrays.copyOfRange(arr, 0, arr.length / 2)));
    dividedTasks.add(new CustomRecursiveTask(Arrays.copyOfRange(arr, arr.length / 2, arr.length)));
    return dividedTasks;
  }

  private Integer processing(int[] arr) {
    return Arrays.stream(arr)
             .filter(a -> a > 10 && a < 27)
             .map(a -> a * 10)
             .sum();
  }

  public static void main(String ... args) {
    //int [] arr = {1,2,3,4,5,6,7,8,9,10};
    int [] arr = {10,20,30,40,50,60,70,80,90,100};
    ForkJoinTask<Integer> task = new CustomRecursiveTask(arr);
    ForkJoinPool pool = new ForkJoinPool();
    int sum = pool.invoke(task);
    System.out.println(sum);
  }
}
