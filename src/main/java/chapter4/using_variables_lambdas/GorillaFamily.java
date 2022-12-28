package chapter4.using_variables_lambdas;

interface Gorilla {
  String move();
}
class GorillaFamily {
  String walk = "walk";
  void everyonePlay(boolean baby) {
    String approach = "amble";
    approach = "run";

    play(() -> walk);
    play(() -> baby ? "hitch a ride" : "run");
    //play(() -> approach);
  }

  void play(Gorilla g) {
    System.out.println(g.move());
  }
}
