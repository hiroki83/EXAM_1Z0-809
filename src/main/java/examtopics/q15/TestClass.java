package examtopics.q15;

import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestClass {
  public static void main(String ... args) {
    Map<Country.Continent, String> map = new HashMap<>();
    map.put(Country.Continent.ASIA, "Z");
    map.put(Country.Continent.AFRICA, "X");
    map.put(Country.Continent.EUROPE, "Y");
    System.out.println(map);
    System.out.println(Country.Continent.ASIA.ordinal());
    System.out.println(Country.Continent.EUROPE.ordinal());
    System.out.println(Country.Continent.AFRICA.ordinal());
    Supplier<String> s = String::new;
    Function<String, Integer> f = ss -> ss.length();
  }
}
