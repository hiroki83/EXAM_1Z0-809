package examtopics.q21;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread implements Runnable {
  private static AtomicInteger count = new AtomicInteger(0);
  public void run() {
    int x = count.incrementAndGet();
    System.out.print(x + " ");
  }
  public static void main(String ... args) {
    Thread thread1 = new Thread(new MyThread());
    Thread thread2 = new Thread(new MyThread());
    Thread thread3 = new Thread(new MyThread());
    Thread thread4 = new Thread(new MyThread());
    Thread thread5 = new Thread(new MyThread());
    Thread thread6 = new Thread(new MyThread());
    Thread thread7 = new Thread(new MyThread());
    Thread thread8 = new Thread(new MyThread());
    Thread thread9 = new Thread(new MyThread());
    Thread thread10 = new Thread(new MyThread());
    Thread thread11 = new Thread(new MyThread());
    Thread thread12 = new Thread(new MyThread());
    Thread thread13 = new Thread(new MyThread());
    Thread thread14 = new Thread(new MyThread());
    Thread thread15 = new Thread(new MyThread());
    Thread thread16 = new Thread(new MyThread());
    Thread [] ta = {thread1, thread2, thread3, thread4, thread5, thread6, thread7, thread8, thread9, thread10, thread11, thread12, thread14, thread15, thread16};
    for (int x = 0; x < ta.length; x++) {
      ta[x].start();
    }
  }
}
