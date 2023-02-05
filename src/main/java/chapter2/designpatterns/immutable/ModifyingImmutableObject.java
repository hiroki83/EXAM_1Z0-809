package chapter2.designpatterns.immutable;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ModifyingImmutableObject {
  public static void main(String[] args) {
    // Create a new Animal instance
    Animal lion = new Animal("lion", 5, Arrays.asList("meat", "more meat"));

    // Create a new Animal instance using data from the first instance
    List<String> favoriteFoods = new ArrayList<String>();
    for(int i = 0; i<lion.getFavoriteFoodsCount(); i++)
      favoriteFoods.add(lion.getFavoriteFood(i));

    Animal updatedLion = new Animal(lion.getSpecies(), lion.getAge()+1, favoriteFoods);
    System.out.println(updatedLion);
  }
}
