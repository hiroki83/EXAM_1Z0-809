package questions.chapter9.q10;

import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

public class TestClass {
  public static void main(String ... args) throws IOException {
    Files.move(Paths.get("monkey.txt"), Paths.get("/animals"),
      StandardCopyOption.ATOMIC_MOVE,
      LinkOption.NOFOLLOW_LINKS);
  }
}
