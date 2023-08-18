package bonus2.q29;

import java.io.IOException;
import java.io.FileNotFoundException;

public class TestClassF {
  public static void main(String ... args) {
    try {
      process();
    } catch(IOException | IllegalArgumentException e) {}
  }
  private static void process() throws FileNotFoundException, IllegalArgumentException {}
}
