package chapter7.medium.concurrentcollection.part3;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample {
  public static void main(String ... args) {
    ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();

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
