package bonus3.q02;

public class ParkRangerF {
  public void noteNewOffspring(Mammal mammal) {
    mammal.numberOfOffspring++;
  }
  public static void main(String ... args) {
    new ParkRangerF().noteNewOffspring(null);
  }
}
