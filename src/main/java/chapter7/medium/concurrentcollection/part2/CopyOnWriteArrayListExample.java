package chapter7.medium.concurrentcollection.part2;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
  public static void main(String[] args) {
    CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
    // Add elements to the list
    list.add("Alice");
    list.add("Bob");
    list.add("Charlie");

    // Create a new thread to add an element to the list
    Thread t1 = new Thread(() -> {
      list.add("Dave");
      System.out.println("Added element 'Dave'");
    });

    // Create a new thread to iterate over the list
    Thread t2 = new Thread(() -> {
      list.forEach(System.out::println);
    });

    // Start the threads
    t1.start();
    t2.start();
  }
}
