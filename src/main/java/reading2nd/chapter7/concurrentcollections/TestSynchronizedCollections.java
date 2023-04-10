package reading2nd.chapter7.concurrentcollections;

import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TestSynchronizedCollections {
  public static void main(String ... args) {
    List<Integer> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList(4, 3, 52)));
    //ConcurrentLinkedQueue<Integer> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList(4, 3, 52)));// DOES NOT COMPILE
    synchronized(list) {
      for(int data: list)
        System.out.print(data+" ");
    }
    System.out.println();

    Map<String, Object> foodData = new HashMap<>();
    foodData.put("Penguin", 1);
    foodData.put("flamingo", 2);
    Map<String, Object> synchronizedFoodData = Collections.synchronizedMap(foodData);
//    for (String key: synchronizedFoodData.keySet()) {
//      synchronizedFoodData.remove(key);// ConcurrentModificationException
//    }
    Iterator<String> it = synchronizedFoodData.keySet().iterator();
    while(it.hasNext()) {
      it.next();
      it.remove();
    }
    System.out.println("Size: "+synchronizedFoodData.size());
  }
}
