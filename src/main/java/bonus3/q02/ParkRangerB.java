package bonus3.q02;

public class ParkRangerB {
  public void noteNewOffspring(Mammal mammal) {
    mammal.numberOfOffspring++;
  }
  public static void main(String ... args) {
    new ParkRangerB().noteNewOffspring(new Antelope());
  }
}
