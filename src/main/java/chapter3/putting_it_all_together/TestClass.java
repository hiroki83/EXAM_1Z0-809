package chapter3.putting_it_all_togher;

import java.util.*;

public class TestClass {
  List<?> list1 = new ArrayList<A>();
  List<? extends A> list2 = new ArrayList<A>();
  List<? super A> list3 = new ArrayList<A>();
  //List<? extends B> list4 = new ArrayList<A>();// DOES NOT COMPILE
  List<? super B> list5 = new ArrayList<A>();
  //List<?> list6 = new ArrayList<? extends A>();// DOES NOT COMPILE

  <T> T method1(List<? extends T> list) {
    return list.get(0);
  }

  //<T> <? extends T> method2(List<? extends T> list) {// DOES NOT COMPILE
  //  return list.get(0);
  //}

  <B extends A> B method3(List<B> list) {
    //return new B(); // DOES NOT COMPILE
    return null;
  }

  void method4(List<? super B> list) {
  }

  //<X> void method5(List<X super B> list) {// DOES NOT COMPILE
  //}
}
class A {}
class B extends A {}
class C extends B {}
