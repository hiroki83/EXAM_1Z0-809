package reading3rd.chapter3.genericclasses_p109;

class Elephant {}
class Zebra {}
class Robot {}
public class Crate<T> {
  private T contents;
  public T emptyCrate() {
    return contents;
  }
  public void packCrate(T contents) {
    this.contents = contents;
  }
  public static void main(String ... args) {
    Elephant elephant = new Elephant();
    Crate<Elephant> crateForElephant = new Crate<>();
    crateForElephant.packCrate(elephant);
    Elephant inNewHome = crateForElephant.emptyCrate();

    Zebra zebra = new Zebra();
    Crate<Zebra> crateForZebra = new Crate<>();
    crateForZebra.packCrate(zebra);
    Zebra inNewPlace = crateForZebra.emptyCrate();

    Robot joeBot = new Robot();
    Crate<Robot> robotCrate = new Crate<>();
    robotCrate.packCrate(joeBot);
    Robot atDestination = robotCrate.emptyCrate();
  }
}
