package questions.chapter1.q21;

public interface Otter {
  default void play() {}
}

class RiverOtter implements Otter {
//  @Override public boolean equals(Object o) {return false;}// COMPILE -> correct!
//  @Override public boolean equals(Otter o) {return false;}// DOES NOT COMPILE -> correct!
//  @Override public int hashCode() {return 42;}// COMPILE -> correct!
//  @Override public long hashCode() {return 42;}// DOES NOT COMPILE -> correct!
//  @Override public void play() {}// DOES NOT COMPILE -> wrong...
//  @Override void play() {}// DOES NOT COMPILE -> correct!
}
