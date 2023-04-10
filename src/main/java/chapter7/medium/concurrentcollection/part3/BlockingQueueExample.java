package chapter7.medium.concurrentcollection.part3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {
  public static void main(String[] args) {
    BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);

    Producer producer = new Producer(queue);
    Consumer consumer = new Consumer(queue);

    new Thread(producer).start();
    new Thread(consumer).start();
  }

  static class Producer implements Runnable {
    private final BlockingQueue<Integer> queue;

    Producer(BlockingQueue<Integer> queue) {
      this.queue = queue;
    }

    @Override
    public void run() {
      try {
        for(int i = 0; i < 10; i++) {
          queue.put(i);
          System.out.println("Producered: " + i);
        }
      } catch(InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  static class Consumer implements Runnable {
    private final BlockingQueue<Integer> queue;

    Consumer(BlockingQueue<Integer> queue) {
      this.queue = queue;
    }

    @Override
    public void run() {
      try {
        for(int i = 0; i < 10; i++) {
          Integer value = queue.take();
          System.out.println("Consumed: " + value);
          Thread.sleep(1000);
        }
      } catch(InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
