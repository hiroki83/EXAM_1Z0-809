package bonus2.q29;

import java.io.IOException;
import java.io.FileNotFoundException;

public class TestClassA {
  public static void main(String ... args) {
    try {
      process();
    //} catch(FileNotFoundException | IOException e) {} // DOES NOT COMPILE
    } catch(IOException e) {} // DOES NOT COMPILE
  }
  private static void process() throws FileNotFoundException, IllegalArgumentException {}
}
