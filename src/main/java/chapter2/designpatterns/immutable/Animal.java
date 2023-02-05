package chapter2.designpatterns.immutable;

import java.util.List;
import java.util.ArrayList;

public final class Animal {
  private final String species;
  private final int age;
  private final List<String> favoriteFoods;

  public Animal(String species, int age, List<String> favoriteFoods) {
    this.species = species;
    this.age = age;
    if(favoriteFoods == null) {
      throw new RuntimeException("favoriteFoods is required");
    }
    this.favoriteFoods = new ArrayList<String>(favoriteFoods);
  }

  public String getSpecies() {
    return this.species;
  }
  public int getAge() {
    return this.age;
  }
  public int getFavoriteFoodsCount() {
    return this.favoriteFoods.size();
  }
  public String getFavoriteFood(int index) {
    return this.favoriteFoods.get(index);
  }
}
