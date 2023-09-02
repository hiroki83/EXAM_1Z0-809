package examtopics.q09;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.ForkJoinPool;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;

public class CustomRecursiveAction extends RecursiveAction {

  private String workload = "";
  private static final int THRESHOLD = 4;

  private static Logger logger = Logger.getAnonymousLogger();

  public CustomRecursiveAction(String workload) {
    this.workload = workload;
  }

  @Override
  protected void compute() {
    if (workload.length() > THRESHOLD) {
      ForkJoinTask.invokeAll(createSubtasks());
    } else {
      processing(workload);
    }
  }

  private List<CustomRecursiveAction> createSubtasks() {
    List<CustomRecursiveAction> subtasks = new ArrayList<>();

    String partOne = workload.substring(0, workload.length() /2);
    String partTwo = workload.substring(workload.length() /2, workload.length());

    subtasks.add(new CustomRecursiveAction(partOne));
    subtasks.add(new CustomRecursiveAction(partTwo));

    return subtasks;
  }

  private void processing(String work) {
    String result = work.toUpperCase();
    logger.info("This result - (" + result + ") - was processed by " + Thread.currentThread().getName());
  }

  public static void main(String ... args) {
    //String workload = "I am programmer, I want to take a certification of Java professional.";
    String workload = "I am hiroki.";
    ForkJoinTask<?> action = new CustomRecursiveAction(workload);
    ForkJoinPool pool = new ForkJoinPool();
    pool.invoke(action);
  }
}
