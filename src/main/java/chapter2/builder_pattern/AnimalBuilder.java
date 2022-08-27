package chapter2.builder_pattern;
import java.util.*;

public class AnimalBuilder {
  private String species;
  private String color;
  private int age;
  private List<String> favoriteFoods;

  public AnimalBuilder setAge(int age) {
    this.age = age;
    return this;
  }

  public AnimalBuilder setSpecies(String species) {
    this.species = species;
    return this;
  }

  public AnimalBuilder setColor(String color) {
    this.color = color;
    return this;
  }

  public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
    this.favoriteFoods = favoriteFoods;
    return this;
  }

  public Animal build() {
    if (color == null)
      return new Animal(species, age, favoriteFoods, "white");
    else
      return new Animal(species, age, favoriteFoods, color);
  }
}
