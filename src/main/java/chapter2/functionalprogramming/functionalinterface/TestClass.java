package chapter2.functionalprogramming.functionalinterface;

public class TestClass {
  public static void main(String[] args) {
    Tiger tiger = new Tiger();
    Animal animal = new Animal("Tiger");
    tiger.sprint(animal);

    printAnimal(animal, a -> System.out.print(a));
  }
  private static void printAnimal(Animal animal, Sprint s) {
    s.sprint(animal);
  }
}
