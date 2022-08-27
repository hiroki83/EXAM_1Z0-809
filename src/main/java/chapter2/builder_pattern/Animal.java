package chapter2.builder_pattern;
import java.util.*;

public final class Animal {
  private final String species;
  private final int age;
  private final List<String> favoriteFoods;
  private final String color;

  public Animal(String species, int age, List<String> favoriteFoods, String color) {
    this.species = species;
    this.age = age;
    this.color = color;
    if (favoriteFoods == null)
      throw new RuntimeException("favoriteFoods is required");
    this.favoriteFoods = new ArrayList<String>(favoriteFoods);
  }
  public String getSpecies() {
    return species;
  }
  public int getAge() {
    return age;
  }
  public String getColor() {
    return color;
  }
  public int getFavoriteFoodsCount() {
    return favoriteFoods.size();
  }
  public String getFavoriteFoods(int index) {
    return favoriteFoods.get(index);
  }
}
