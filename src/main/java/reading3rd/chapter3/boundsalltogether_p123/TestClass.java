package reading3rd.chapter3.boundsalltogether_p123;

import java.util.List;
import java.util.ArrayList;

class A {}
class B extends A {}
class C extends B {}
public class TestClass {
  public static void main(String ... args) {
    List<?> list1 = new ArrayList<A>();
    List<? extends A> list2 = new ArrayList<A>();
    List<? super A> list3 = new ArrayList<A>();
    //List<? extends B> list4 = new ArrayList<A>();// DOES NOT COMPILE
    List<? super B> list5 = new ArrayList<A>();
    //List<?> list6 = new ArrayList<? extends A>();// DOES NOT COMPILE
  }
  <U> U method0(List<U> list) {
    return list.get(0);
  }
  <T> T method1(List<? extends T> list) {
    return list.get(0);
  }
  //<T> <? extends T> method2(List<? extends T> list) {// DOES NOT COMPILE
  //  return list.get(0);
  //}
  <B extends A> B method3(List<B> list) {// DOES NOT COMPILE
    //return new B();// DOES NOT COMPILE
    return list.get(0);
  }
  <L extends A> B method3ver2(List<L> list) {
    return new B();
  }
  void method4(List<? super B> list) {
  }
  //<X> void method5(List<X super B> list) {}// DOES NOT COMPILE
}
