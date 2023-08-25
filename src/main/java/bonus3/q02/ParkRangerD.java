package bonus3.q02;

public class ParkRangerD {
  public void noteNewOffspring(Mammal mammal) {
    mammal.numberOfOffspring++;
  }
  public static void main(String ... args) {
    new ParkRangerD().noteNewOffspring((Mammal) new Object()); // throws ClassCastException at runtime
  }
}
