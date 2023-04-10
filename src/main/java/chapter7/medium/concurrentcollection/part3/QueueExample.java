package chapter7.medium.concurrentcollection.part3;

import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;

public class QueueExample {
  public static void main(String[] args) throws InterruptedException {
    Queue<Integer> queue = new LinkedList<>(Arrays.asList(new Integer[5]));
    //Queue<Integer> queue = new LinkedList<>();

    Producer producer = new Producer(queue);
    Consumer consumer = new Consumer(queue);

    new Thread(producer).start();
    Thread.sleep(1000);
    new Thread(consumer).start();
  }

  static class Producer implements Runnable {
    private final Queue<Integer> queue;

    Producer(Queue<Integer> queue) {
      this.queue = queue;
    }

    @Override
    public void run() {
//      try {
        for(int i = 0; i < 10; i++) {
          queue.offer(i);
          //queue.add(i);
          System.out.println("Producered: " + i);
        }
//      } catch(InterruptedException e) {
//        e.printStackTrace();
//      }
      System.out.println("print queue contents" + queue);
    }
  }

  static class Consumer implements Runnable {
    private final Queue<Integer> queue;

    Consumer(Queue<Integer> queue) {
      this.queue = queue;
    }

    @Override
    public void run() {
      try {
        for(int i = 0; i < 10; i++) {
          Integer value = queue.poll();
          //Integer value = queue.remove();
          System.out.println("Consumed: " + value);
          Thread.sleep(1000);
        }
      } catch(InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
