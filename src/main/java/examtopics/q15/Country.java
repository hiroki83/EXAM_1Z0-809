package examtopics.q15;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Country {

  public enum Continent {
    ASIA, EUROPE, AFRICA
  }

  String name;
  Continent region;

  public Country(String na, Continent reg) {
    name = na;
    region = reg;
  }

  public String getName() {
    return name;
  }

  public Continent getRegion() {
    return region;
  }

  public String toString() {
    return name;
  }

  public static void main(String ... args) {
    List<Country> couList = Arrays.asList(
      new Country("Japan", Country.Continent.ASIA),
      new Country("South Africa", Country.Continent.AFRICA),
      new Country("Kongo", Country.Continent.AFRICA),
      new Country("Kenya", Country.Continent.AFRICA),
      //new Country("Germany", Country.Continent.EUROPE), // {EUROPE=[Germany, Italy], ASIA=[Japan]}
      new Country("Italy", Country.Continent.EUROPE),
      new Country("Germany", Country.Continent.EUROPE)); // {EUROPE=[Italy, Germany], ASIA=[Japan]}
    Map<Country.Continent, List<String>> regionNames = couList.stream()
    //  .collect(Collectors.groupingBy(Country::getRegion,
      .collect(Collectors.groupingBy(x -> x.getRegion(),
         Collectors.mapping(Country::getName, Collectors.toList())
    //Map<Country.Continent, List<Country>> regionNames = couList.stream()
    //  .collect(Collectors.groupingBy(Country::getRegion
      )
    );
    System.out.println(regionNames);
    System.out.println(regionNames.getClass().getName());
  }
}
