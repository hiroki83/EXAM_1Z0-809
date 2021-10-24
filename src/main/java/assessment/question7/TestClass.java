package assessment.question7;
import java.nio.file.*;
import java.io.File;
import java.io.IOException;
public class TestClass {
  public static void main(String[] args) throws IOException {
    Path path1 = Paths.get("/Users/hirokiinoue/Practice1Z0809/").resolve(Paths.get("./sleep.txt")).normalize();
    Path path2 = new File("./sleep2.txt").toPath().toRealPath();

    System.out.print(Files.isSameFile(path1,path2));
    System.out.println(" "+path1.equals(path2));
  }
}
