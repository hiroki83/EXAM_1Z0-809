package chapter7.medium.deadlockprevention;

public class FixedLockOrderExample {
  public static Object lock1 = new Object();
  public static Object lock2 = new Object();

  public static void main(String[] args) throws InterruptedException {
    Thread threadA = new Thread(() -> {
      synchronized(lock1) {
        System.out.println("Thread A acquired lock 1");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          // handle the exception
        }
        synchronized(lock2) {
          System.out.println("Thread A acquired lock 2");
        }
      }
    });

    Thread threadB = new Thread(() -> {
      synchronized(lock1) {
        System.out.println("Thread B acquired lock 1");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          // handle the exception
        }
        synchronized(lock2) {
          System.out.println("Thread B acquired lock 2");
        }
      }
    });
    threadA.start();
    //Thread.sleep(2000);
    threadB.start();
  }
}
