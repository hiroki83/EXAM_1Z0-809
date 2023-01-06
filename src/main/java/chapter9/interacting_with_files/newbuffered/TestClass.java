package chapter9.interacting_with_files.newbuffered;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class TestClass {
  public static void main(String[] args) {
    System.out.println("default carset: "+Charset.defaultCharset());
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "newbuffered", "animals", "gopher.txt"));
    Path path2 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "newbuffered", "animals", "gorilla.txt"));
    try(BufferedReader reader = Files.newBufferedReader(path1, Charset.forName("US-ASCII"));
         BufferedWriter writer = Files.newBufferedWriter(path2, Charset.forName("UTF-16"))) {
      // Read from the stream
      String currentLine = null;
      while((currentLine = reader.readLine()) != null)
        System.out.println(currentLine);

      writer.write("Hello World!");
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}
