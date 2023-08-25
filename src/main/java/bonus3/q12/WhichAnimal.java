package bonus3.q12;

public class WhichAnimal {
  enum AnimalsInPark {
    SQUIRREL, CHIPMUNK, SPARROW
  }
  public static void main(String ... args) {
    AnimalsInPark a = AnimalsInPark.CHIPMUNK;
    switch (a) {
      //case AnimalsInPark.SQUIRREL: System.out.print("S"); // DOES NOT COMPILE
      //case AnimalsInPark.CHIPMUNK: System.out.print("C"); // DOES NOT COMPILE
      case SQUIRREL: System.out.print("S");
      case CHIPMUNK: System.out.print("C");
      default: System.out.print("P");
    }
  }
}
