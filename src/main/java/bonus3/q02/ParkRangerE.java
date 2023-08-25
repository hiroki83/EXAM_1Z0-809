package bonus3.q02;

public class ParkRangerE {
  public void noteNewOffspring(Mammal mammal) {
    mammal.numberOfOffspring++;
  }
  public static void main(String ... args) {
    //new ParkRangerE().noteNewOffspring((Mammal)new String()); // DOES NOT COMPILE
  }
}
