package reading3rd.chapter7.obtainingsynchronizedcollections_p365;

import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TestClass3 {
  Queue<Integer> list = new ConcurrentLinkedQueue(Arrays.asList(4,3,52));
  public static void main(String ... args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(10);
      TestClass3 test = new TestClass3();
      int[] counter = new int[1];
      for(int i = 0; i<10; i++) {
        //service.submit(() -> new TestClass::print));
        service.submit(() -> test.print(++counter[0]));
      }
    } finally {
      if(service!=null) service.shutdown();
    }
  }
  private void print(int counter) {
//    System.out.println("START "+counter);
//    synchronized(list) {
//      System.out.println("SYNC  "+counter);
      for(int data: list)
        System.out.println("SYNC  "+counter+", vaule: "+data+" ");
//    }
//    System.out.println("E N D "+counter);
  }
}
