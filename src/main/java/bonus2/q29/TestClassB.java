package bonus2.q29;

import java.io.IOException;
import java.io.FileNotFoundException;

public class TestClassB {
  public static void main(String ... args) {
    try {
      process();
    //} catch(FileNotFoundException | InterruptedException e) {}// DOES NOT COMPILE
    } catch(FileNotFoundException e) {}
  }
  private static void process() throws FileNotFoundException, IllegalArgumentException {}
}
