package bonus1.q14;

public class WhatisIt {
  interface Furry {}
  //class Chipmunk {}// DOES NOT COMPILE
  static class Chipmunk {}
  class FurryChipmunk implements Furry {}
  public static void main(String ... args) {
    Chipmunk c = new Chipmunk();
    int result = 0;
    if (c instanceof Furry) result += 1;
    if (c instanceof Chipmunk) result += 2;
    if (null instanceof FurryChipmunk) result += 4;
      System.out.println(result);
  }
}
