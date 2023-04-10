package chapter7.medium.concurrentcollection.part3;

import java.util.Map;
import java.util.TreeMap;

public class MapExample {
  public static void main(String ... args) {
    Map<Integer, String> map = new TreeMap<>();

    Thread writerThread = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        map.put(i, "Value" + i);
        System.out.println("Added: " + i);
        try {
          Thread.sleep(1000);
        } catch(InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    Thread readerThread = new Thread(() -> {
      while(true) {
        System.out.println("Size of map: " + map.size());
        for (Integer key : map.keySet()) {
          System.out.println(key + " - " + map.get(key));
          try {
            Thread.sleep(1000);
          } catch(InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    });
    writerThread.start();
    readerThread.start();
  }
}
