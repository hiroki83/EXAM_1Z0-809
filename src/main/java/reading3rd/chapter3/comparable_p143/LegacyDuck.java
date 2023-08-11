package reading3rd.chapter3.comparable_p143;

public class LegacyDuck implements Comparable {
  private String name;
  @Override
  public int compareTo(Object obj) {
    LegacyDuck d = (LegacyDuck) obj;
    return name.compareTo(d.name);
  }
  public static void main(String ... args) {
  }
}
