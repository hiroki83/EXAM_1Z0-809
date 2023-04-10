package chapter7.medium.concurrentcollection.part2;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
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
