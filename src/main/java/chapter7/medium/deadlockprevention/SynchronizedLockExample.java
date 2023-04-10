package chapter7.medium.deadlockprevention;

public class SynchronizedLockExample {
  private final Object lock1 = new Object();
  private final Object lock2 = new Object();

  public void method1() {
    synchronized (lock1) {
      System.out.println("method1: lock1 acquired");
      try {
        Thread.sleep(1000); // simulate some work
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      synchronized (lock2) {
        System.out.println("method1: lock2 acquired");
        // Do something
      }
    }
  }

  public void method2() {
    synchronized (lock2) {
      System.out.println("method2: lock2 acquired");
      try {
        Thread.sleep(1000); // simulate some work
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      synchronized (lock1) {
        System.out.println("method2: lock1 acquired");
        // Do something
      }
    }
  }

  public static void main(String ... args) {
    SynchronizedLockExample example = new SynchronizedLockExample();
    Thread t1 = new Thread(new Runnable() {
      public void run() {
        example.method1();
      }
    });

    Thread t2 = new Thread(new Runnable() {
      public void run() {
        example.method2();
      }
    });

    t1.start();
    t2.start();
  }
}
