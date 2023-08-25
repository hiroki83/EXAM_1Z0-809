package bonus3.q02;

public class ParkRangerC {
  public void noteNewOffspring(Mammal mammal) {
    mammal.numberOfOffspring++;
  }
  public static void main(String ... args) {
    //new ParkRangerC().noteNewOffspring(new WalksOn4Legs()); // DOES NOT COMPILE
  }
}
