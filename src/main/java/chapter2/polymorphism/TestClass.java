package chapter2.polymorphism;

public class TestClass {
  public static void main(String[] args) {
    Primate primate = new Lemur();
    Lemur lemur2 = (Lemur) primate;
    Lemur lemur3 = (Lemur) primate;
    System.out.println(lemur2.age);
    System.out.println(lemur3.age);
    lemur2.age = 20;
    System.out.println(lemur2.age);
    System.out.println(lemur3.age);
  }
}
