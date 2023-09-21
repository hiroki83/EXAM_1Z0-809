package examtopics.q25;

interface TestInterface2 {
  public abstract void test1();
  public default void test2() {
    System.out.println("main interface2 default method");
  }
  public static void test3() {
    System.out.println("main interface2 static method");
  }
}

interface TestInterface3 {
  public abstract void test1();
  public default void test2() {
    System.out.println("main interface3 default method");
  }
  public static void test3() {
    System.out.println("main interface3 static method");
  }
}

interface ChildTestIterface1 extends TestInterface2, TestInterface3 {
  public abstract void test1();
  public default void test2() {
    System.out.println("child interface1 default method");
  }
  public static void test3() {
    System.out.println("child interface1 static method");
  }
}

//interface ChildTestIterface2 extends TestInterface2, TestInterface3 { // COMPILE ERROR
//}

abstract class TestAbstractClass1 implements TestInterface2 {
  public abstract void test1();
  public void test2() {
    System.out.println("abstract class override default method");
  }
  public void test3() {
    System.out.println("abstract class override static method");
  }
}

abstract class TestAbstractClass2 implements TestInterface2 {
  public abstract void test2();
  public abstract void test3();
}

public class TestClass2 {
  public static void main(String ... args) {
  }
}
