package chapter2.factory_pattern;

import chapter2.factory_pattern.factories.Fish;
import chapter2.factory_pattern.factories.Food;
import chapter2.factory_pattern.factories.FoodFactory;

public class ZooKeeper {
  public static void main(String[] args) {
    final Food food = FoodFactory.getFood("polar bear");
    //final Food food = new Fish(15);
    food.consumed();
  }
}
