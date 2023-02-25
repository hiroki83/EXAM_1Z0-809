package chapter3.putting_it_all_together;

import java.util.*;

public class TestClass {
  List<?> list1 = new ArrayList<ClassA>();
  List<? extends ClassA> list2 = new ArrayList<ClassA>();
  List<? super ClassA> list3 = new ArrayList<ClassA>();
  //List<? extends B> list4 = new ArrayList<ClassA>();// DOES NOT COMPILE
  List<? super B> list5 = new ArrayList<ClassA>();
  //List<?> list6 = new ArrayList<? extends ClassA>();// DOES NOT COMPILE

  <T> T method1(List<? extends T> list) {
    return list.get(0);
  }

  //<T> <? extends T> method2(List<? extends T> list) {// DOES NOT COMPILE
  //  return list.get(0);
  //}

  <B extends ClassA> B method3(List<B> list) {
    //return new B(); // DOES NOT COMPILE
    return null;
  }

  <C extends ClassA> B method3bis2(List<C> list) {
    return new B();
  }

  //<T super ClassA> T method3bis2(List<T> list) {// DOES NOT COMPILE
  //  return list.get(0);
  //}

  void method4(List<? super B> list) {
  }

  //<X> void method5(List<X super B> list) {// DOES NOT COMPILE
  //}
}
class ClassA {}
class B extends ClassA {}
class C extends B {}
