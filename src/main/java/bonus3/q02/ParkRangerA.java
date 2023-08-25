package bonus3.q02;

public class ParkRangerA {
  public void noteNewOffspring(Mammal mammal) {
    mammal.numberOfOffspring++;
  }
  public static void main(String ... args) {
    //new ParkRangerA().noteNewOffspring(new Mammal()); // DOES NOT COMPILE
  }
}
