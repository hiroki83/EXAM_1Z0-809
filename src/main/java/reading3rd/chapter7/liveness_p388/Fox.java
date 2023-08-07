package reading3rd.chapter7.liveness_p388;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Fox {
  private String name;
  public String getName() {
    return this.name;
  }
  public Fox(String name) {
    this.name = name;
  }
  public void eatAndDrink(Food food, Water water, Fox fox) {
    synchronized(food) {
      System.out.println(fox.getName()+"Got Food!");
      move();
      synchronized(water) {
        System.out.println(fox.getName()+"Got Water!");
      }
    }
  }
  public void drinkAndEat(Food food, Water water, Fox fox) {
    synchronized(water) {
      System.out.println(fox.getName()+"Got Water!");
      move();
      synchronized(food) {
        System.out.println(fox.getName()+"Got Food!");
      }
    }
  }
  public void move() {
    try {
      Thread.sleep(100);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String ... args) {
    // Create participants and resources
    Fox foxy = new Fox("foxy");
    Fox tails = new Fox("tails");
    Food food = new Food();
    Water water = new Water();

    // Process data
    ExecutorService service = null;
    try {
      service = Executors.newScheduledThreadPool(10);
      service.submit(() -> foxy.eatAndDrink(food, water, foxy));
      service.submit(() -> tails.drinkAndEat(food, water, tails));
    } finally {
      if (service!=null) service.shutdown(); 
    }
  }
}
