package chapter7.medium.deadlockprevention;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTimeoutExample {
  private final Lock lock1 = new ReentrantLock();
  private final Lock lock2 = new ReentrantLock();

  private void method1() {
    boolean lock1Acquired = false;
    boolean lock2Acquired = false;
    try {
      System.out.println("Thread 1: Attempting to acquire lock1");
      lock1Acquired = lock1.tryLock(500, TimeUnit.MILLISECONDS);
      System.out.println("Thread 1: Acquired lock1 = " + lock1Acquired);
      System.out.println("Thread 1: Attempting to acquire lock2");
      lock2Acquired = lock2.tryLock(500, TimeUnit.MILLISECONDS);
      System.out.println("Thread 1: Acquired lock2 = " + lock2Acquired);
      if (lock1Acquired && lock2Acquired) {
       // Do something
       System.out.println("Thread 1: has acquired lock1 and lock2");
      } else {
       // Locks not acquired
       System.out.println("Thread 1: has not acquired lock1 and lock2");
      }
    } catch (InterruptedException e) {
      // Handle the exception
    } finally {
      if (lock1Acquired) {
        lock1.unlock();
        System.out.println("Thread 1: Released lock1");
      }
      if (lock2Acquired) {
        lock2.unlock();
        System.out.println("Thread 1: Released lock2");
      }
    }
  }

  private void method2() {
    boolean lock1Acquired = false;
    boolean lock2Acquired = false;
    try {
      System.out.println("Thread 2: Attempting to acquire lock2");
      lock2Acquired = lock2.tryLock(500, TimeUnit.MILLISECONDS);
      System.out.println("Thread 2: Acquired lock2 = " + lock2Acquired);
      System.out.println("Thread 2: Attempting to acquire lock1");
      lock1Acquired = lock1.tryLock(500, TimeUnit.MILLISECONDS);
      System.out.println("Thread 2: Acquired lock1 = " + lock1Acquired);
      if (lock1Acquired && lock2Acquired) {
       // Do something
       System.out.println("Thread 2: has acquired lock1 and lock2");
      } else {
       // Locks not acquired
       System.out.println("Thread 2: has not acquired lock1 and lock2");
      }
    } catch (InterruptedException e) {
      // Handle the exception
    } finally {
      if (lock1Acquired) {
        lock1.unlock();
        System.out.println("Thread 2: Released lock1");
      }
      if (lock2Acquired) {
        lock2.unlock();
        System.out.println("Thread 2: Released lock2");
      }
    }
  }
  public static void main(String ... args) {
    LockTimeoutExample example = new LockTimeoutExample();
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
