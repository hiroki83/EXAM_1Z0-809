package chapter1.usinginstanceof;

public class TestClass {
  public static void main(String[] args) {
    Hippo hippoPure = new Hippo();
    //boolean b1 = hippoPure instanceof Elephant;// COMPILE ERROR
    HeavyAnimal hippo = new Hippo();
    boolean b6 = hippo instanceof Mother;
    System.out.println(b6);
    HeavyAnimal mother = new MotherHippo();
    boolean b7 = mother instanceof Mother;
    System.out.println(b7);
  }
}
