package chapter7.medium.deadlockprevention;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HigherLevelConcurrencyExample {
  private final Lock lock = new ReentrantLock();

  public void method1() {
    long threadId = Thread.currentThread().getId();
    System.out.println("method1: START");
    lock.lock();
    try {
      System.out.println("method1[" + threadId + "]: acquired lock");
      System.out.println("method1[" + threadId + "]: START sleep");
      Thread.sleep(1000);
      System.out.println("method1[" + threadId + "]: E N D sleep");
      System.out.println("method1[" + threadId + "]: START call method2()");
      method2();
      System.out.println("method1[" + threadId + "]: E N D call method2()");
    } catch(InterruptedException e) {
      System.out.println("method1[" + threadId + "]: interrupted");
    } finally {
      System.out.println("method1[" + threadId + "]: releasing lock");
      lock.unlock();
    }
    System.out.println("method1[" + threadId + "]: E N D");
  }

  public void method2() {
    long threadId = Thread.currentThread().getId();
    System.out.println("method2[" + threadId + "]: START");
    lock.lock();
    try {
      System.out.println("method2[" + threadId + "]: acquired lock");
      System.out.println("method2[" + threadId + "]: START sleep");
      Thread.sleep(1000);
      System.out.println("method2[" + threadId + "]: E N D sleep");
    } catch(InterruptedException e) {
      System.out.println("method2[" + threadId + "]: interrupted");
    } finally {
      System.out.println("method2[" + threadId + "]: releasing lock");
      lock.unlock();
    }
    System.out.println("method2[" + threadId + "]: E N D");
  }

  public static void main(String[] args) {
    HigherLevelConcurrencyExample example = new HigherLevelConcurrencyExample();
    ExecutorService executor = Executors.newFixedThreadPool(2);

    executor.submit(new Runnable() {
      public void run() {
        example.method1();
      }
    });
    executor.submit(new Runnable() {
      public void run() {
        example.method2();
      }
    });

    executor.shutdown();
    try {
      executor.awaitTermination(10, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      System.out.println("main: interrupted while waiting for termination");
    }
  }
}
