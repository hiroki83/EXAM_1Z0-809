package reading3rd.chapter3.interactinglegacycode_p115;

import java.util.List;
import java.util.ArrayList;

public class Unicorns {
  public static void main(String ... args) {
    List<Unicorn> unicorns = new ArrayList<>();
    addUnicorn(unicorns);
    Unicorn unicorn = unicorns.get(0);
  }

  //private static void addUnicorn(List unicorn) {
  private static void addUnicorn(List<Unicorn> unicorn) {
    //unicorn.add(new Dragon());
    unicorn.add(new Unicorn());
  }
}
