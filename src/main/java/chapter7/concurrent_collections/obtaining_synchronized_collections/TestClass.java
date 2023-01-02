package chapter7.concurrent_collections.obtaining_synchronized_collections;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TestClass {
  //private List<Integer> count = Collections.synchronizedList(new ArrayList<>(Arrays.asList(0)));
  private List<Integer> count = new ArrayList<>(Arrays.asList(0));
  private void incrementAndReport() {
    try {
      //System.out.println("start");
      synchronized(this) {
        System.out.print(count.set(0,count.get(0)+1)+" ");
      }
      //System.out.println("e n d");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    List<Integer> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList(4,3,52)));
    synchronized(list) {
      for(int data: list)
        System.out.println(data+" ");
    }
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(20);
      TestClass manager = new TestClass();
      for(int i = 0; i<10; i++)
        service.submit(() -> manager.incrementAndReport());
      System.out.println();
    } finally {
      if(service != null) service.shutdown();
    }
  }
}
