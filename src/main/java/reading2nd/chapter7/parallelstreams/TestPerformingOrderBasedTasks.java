package reading2nd.chapter7.parallelstreams;

import java.util.Arrays;

public class TestPerformingOrderBasedTasks {
  public static void main(String ... args) {
    System.out.println("parallel stream findAny(): " + Arrays.asList(1,2,3,4,5,6).parallelStream().findAny().get());
    System.out.println("serial stream   findAny(): " + Arrays.asList(1,2,3,4,5,6).stream().findAny().get());
    System.out.println("parallel stream skip(5): " + Arrays.asList(1,2,3,4,5,6).parallelStream().skip(5).findFirst().get());
    System.out.println("serial stream   skip(5): " + Arrays.asList(1,2,3,4,5,6).stream().skip(5).findFirst().get());
    System.out.println("parallel stream limit(2): " + Arrays.asList(1,2,3,4,5,6).parallelStream().limit(3).reduce((first, second) -> second).get());
    System.out.println("serial stream   limit(2): " + Arrays.asList(1,2,3,4,5,6).stream().limit(3).reduce((first, second) -> second).get());
    System.out.println("parallel stream findFirst(): " + Arrays.asList(1,2,3,4,5,6).parallelStream().findFirst().get());
    System.out.println("serial stream   findFirst(): " + Arrays.asList(1,2,3,4,5,6).stream().findFirst().get());
  }
}
