package reading3rd.chapter7.performanceimprovements_p369;

import java.util.List;
import java.util.ArrayList;

public class WhaleDataCalculatorParallel {
  public int processRecord(int input) {
    try {
      Thread.sleep(10);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return input+1;
  }
  public void processAllData(List<Integer> data) {
    data.stream().parallel().map(a -> processRecord(a)).count();
    //data.parallelStream().map(a -> processRecord(a)).count();
  }
  public static void main(String ... args) {
    WhaleDataCalculatorParallel calculator = new WhaleDataCalculatorParallel();
    // Define the data
    List<Integer> data = new ArrayList<Integer>();
    for(int i=0; i<4000; i++) data.add(i);

    // Process the data
    long start = System.currentTimeMillis();
    calculator.processAllData(data);
    double time = (System.currentTimeMillis()-start)/1000.0;

    // Report results
    System.out.println("\nTasks completed in: "+time+" seconds");
  }
}
