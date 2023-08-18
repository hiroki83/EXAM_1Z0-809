package bonus2.q29;

import java.io.IOException;
import java.io.FileNotFoundException;

public class TestClassG {
  public static void main(String ... args) {
    try {
      process();
    } catch(FileNotFoundException | IllegalStateException | IllegalArgumentException e) {}
  }
  private static void process() throws FileNotFoundException, IllegalArgumentException {}
}
