package chapter7.medium.deadlockprevention;

public class SynchronizedMethodLockExample {
  //private final Object lock1 = new Object();
  //private final Object lock2 = new Object();

  public synchronized void method1() {
    System.out.println("method1: START");
    try {
      Thread.sleep(1000); // simulate some work
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("method1: E N D");
  }

  public synchronized void method2() {
    System.out.println("method2: START");
    try {
      Thread.sleep(1000); // simulate some work
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("method2: E N D");
  }

  public static void main(String ... args) {
    SynchronizedMethodLockExample example = new SynchronizedMethodLockExample();
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
