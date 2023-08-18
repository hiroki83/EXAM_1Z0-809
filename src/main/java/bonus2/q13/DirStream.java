package bonus2.q13;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class DirStream {
  public static void main(String ... args) {
    String rootPath = "/Users/hirokiinoue/git_repositories/EXAM_1Z0-809/src/main/resources/bonus2/q13/" + "capybara/food";
    Path one = Paths.get(rootPath, "apples.txt");
    Path two = Paths.get(rootPath, "bananas.txt");
    try {
      Files.copy(one, two);
    //} catch (Exception e) { // DOES NOT COMPILE
    } catch (IOException e) {
      e.printStackTrace();
    //} catch (IOException e) { // DOES NOT COMPILE
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
