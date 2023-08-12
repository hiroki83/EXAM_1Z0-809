package reading3rd.chapter3.methodreferences_p152;

public class DuckHelper {
  public static int compareByWeight(Duck d1, Duck d2) {
    return d1.getWeight() - d2.getWeight();
  }
  public static int compareByName(Duck d1, Duck d2) {
    return d1.getName().compareTo( d2.getName());
  }
}
