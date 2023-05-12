package questions.chapter9.q1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestClass {
  public static void main(String ... args) {
    //Path path = Path.get("/user/.././root","../kodiacbear.txt");
    Path path = Paths.get("/user/.././root","../kodiacbear.txt");
    //path.normalize().relativize("/lion");
    path.normalize().relativize(Paths.get("/lion"));
    System.out.println(path);
    System.out.println(path.normalize().relativize(Paths.get("/lion")));
  }
}
