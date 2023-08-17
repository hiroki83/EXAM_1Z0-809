package bonus2.q36;

import java.io.Console;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.IOException;

public class TestClass {
  public static void main(String ... args) throws IOException {
    String line;
    Console c = System.console();
    Writer w = c.writer();
    if ((line = c.readLine()) != null)
      w.append(line);
      //w.append(line).println(); // DOES NOT COMPILE, Writer does not have the println() method. The writer() method of Console returns PrintWriter. PrintWriter has the println() method.
      w.flush();
      c.flush();


    //System.console().writer().println();
    Console c2 = System.console();
    PrintWriter w2 = c.writer();
    line = c2.readLine();
    w2.println(line);
  }
}
