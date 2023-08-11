package reading3rd.chapter3.interactinglegacycode_p115;

import java.util.List;
import java.util.ArrayList;

public class Dragons {
  public static void main(String ... args) {
    //List<Unicorn> unicorns = new ArrayList();
    List<Dragon> dragons = new ArrayList();
    //unicorns.add(new Unicorn());
    dragons.add(new Dragon());
    //printDragons(unicorns);
    printDragons(dragons);
  }

  private static void printDragons(List<Dragon> dragons) {
    for (Dragon dragon: dragons) {
      System.out.println(dragon);
    }
  }
  private static void printUnicorns(List<Unicorn> unicorns) {
    for (Unicorn unicorn: unicorns) {
      System.out.println(unicorn);
    }
  }
}
