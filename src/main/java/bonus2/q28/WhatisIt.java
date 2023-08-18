package bonus2.q28;

public class WhatisIt {
  static interface Furry {}
  static class Chipmunk {}
  static class FurryChipmunk implements Furry {}
  public static void main(String ... args) {
    Chipmunk c = new Chipmunk();
    int result = 0;
    if (c instanceof Furry) result +=1;
    if (c instanceof Chipmunk) result +=2;
    //if (c instanceof FurryChipmunk) result +=3; // DOES NOT COMPILE
    if (null instanceof FurryChipmunk) result +=4;
    System.out.println(result);
  }
}
