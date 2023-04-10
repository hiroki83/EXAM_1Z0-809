package chapter7.medium.concurrentcollection.part2;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    // Create three threads
    Thread producerThread = new Thread(new Producer(queue));
    Thread consumerThread1 = new Thread(new Consumer(queue));
    Thread consumerThread2 = new Thread(new Consumer(queue));

    // Start the threads
    producerThread.start();
    consumerThread1.start();
    consumerThread2.start();

    // wait for the threads to finish
    try {
      producerThread.join();
      consumerThread1.join();
      consumerThread2.join();
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
  }

  static class Producer implements Runnable {
    private final Queue<Integer> queue;

    public Producer(Queue<Integer> queue) {
      this.queue = queue;
    }

    @Override
    public void run() {
      for (int i = 0; i < 10; i++) {
        queue.offer(i);
        System.out.println("Produced: " + i);
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }

  static class Consumer implements Runnable {
    private final Queue<Integer> queue;

    public Consumer(Queue<Integer> queue) {
      this.queue = queue;
    }

    @Override
    public void run() {
      for (int i = 0; i < 10; i++) {
        Integer value = queue.poll();
        if (value != null) {
          System.out.println("Consumed: " + value);
        } else {
          System.out.println("Queue is empty");
          try {
            Thread.sleep(200);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    }
  }
}
