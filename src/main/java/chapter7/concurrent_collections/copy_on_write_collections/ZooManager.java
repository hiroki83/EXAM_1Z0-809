package chapter7.concurrent_collections.copy_on_write_collections;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ZooManager {
  List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4,3,52));
  public void add(Integer integer) {
    for(Integer item: list) {
      System.out.print(item+" ");
      list.add(integer);
    }
    System.out.println();
    System.out.println("Size: "+list.size());
  }
  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(100);
      ZooManager manager = new ZooManager();
      for (int i = 0; i < 50; i++) {
        final int index = i;
        service.submit(() -> manager.add(index));
      }
    } finally {
      if(service != null) service.shutdown();
    }
  }
}
