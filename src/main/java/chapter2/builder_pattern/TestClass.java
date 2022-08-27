package chapter2.builder_pattern;
import java.util.*;
public class TestClass {
  public static void main(String[] args) {
    AnimalBuilder humanBuilder = new AnimalBuilder();
    Animal human = humanBuilder.setAge(38).setSpecies("Human").setFavoriteFoods(Arrays.asList("meat","fish")).build();
    System.out.println("Species: " + human.getSpecies());
    System.out.println("Color: " + human.getColor());
    System.out.println("Age: " + human.getAge());
    System.out.println("FavoriteFoods1: " + human.getFavoriteFoods(0));
    System.out.println("FavoriteFoods2: " + human.getFavoriteFoods(1));
  }
}
