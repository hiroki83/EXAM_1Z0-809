package chapter2.functionalprogramming.functionalinterface;

public class Tiger implements Sprint {
  public void sprint(Animal animal) {
    System.out.println("Animal is sprinting fast! "+animal.toString());
  }
}
