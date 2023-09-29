package reading4th.chapter1.overriding_p35;

public class Animal {
  protected void drink() {
  }
}
class Dog extends Animal {
  @Override
  //void drink() { // does not compile
  protected void drink() {
  }
}
