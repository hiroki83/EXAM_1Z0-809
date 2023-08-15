package reading3rd.chapter4.variablelambdas_p172;

interface Gorilla { String move(); }
public class GorillaFamily {
  String walk = "walk";
  static String str = null;
  void everyonePlay(boolean baby) {
    final String approach = "amble";
    //approach = "run";
    str = "modified";
    walk = "walked";

    play(() -> walk);
    play(() -> baby ? "hitch a ride": "run");
    play(() -> approach);
    play(() -> str);
  }

  void play(Gorilla g) {
    System.out.println(g.move());
  }
  public static void main(String ... args) {
    GorillaFamily gorillaFamily = new GorillaFamily();
    gorillaFamily.everyonePlay(true);
  }
}
