package reading3rd.chapter3.comparable_p143;

public class Animal implements Comparable<Animal> {
  private int id;
  @Override
  public int compareTo(Animal a) {
    return id - a.id;
  }
  public static void main(String ... args) {
    Animal a1 = new Animal();
    Animal a2 = new Animal();
    a1.id = 5;
    a2.id = 7;

    System.out.println(a1.compareTo(a2));
    System.out.println(a1.compareTo(a1));
    System.out.println(a2.compareTo(a1));
  }
}
