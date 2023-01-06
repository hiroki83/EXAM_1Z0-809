package chapter9.interacting_with_files.copy;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestClass {
  public static void main(String[] args) {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "copy", "panda"));
    Path path2 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "copy", "panda-save"));
    Path path3 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "copy", "panda", "bamboo.txt"));
    Path path4 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "copy", "panda-save", "bamboo.txt"));
    Path path5 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "copy", "mammals", "wolf.txt"));
    Path path6 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "copy", "fish", "clown.xsl"));
    try {
      System.out.println("Does exists "+path2+" ? "+(Files.exists(path2) ? "Yes." : "No."));
      System.out.println("Does exists "+path4+" ? "+(Files.exists(path4) ? "Yes." : "No."));
      if (!Files.exists(path2)) {
        Files.copy(path1, path2);
        System.out.println("Does exists "+path2+" ? "+(Files.exists(path2) ? "Yes." : "No."));
      }
      if (!Files.exists(path4)) {
        Files.copy(path3, path4);
        System.out.println("Does exists "+path4+" ? "+(Files.exists(path4) ? "Yes." : "No."));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Copying Files with java.io and NIO.2
    try (InputStream is = new FileInputStream("/Users/hirokiinoue/Practice1Z0809/src/main/resources/chapter9/interacting_with_files/copy/source-data.txt");
          OutputStream out = new FileOutputStream("/Users/hirokiinoue/Practice1Z0809/src/main/resources/chapter9/interacting_with_files/copy/output-data.txt")) {
      // Copy stream data to file
      if(!Files.exists(path5)) {
        Files.copy(is, path5);
        System.out.println("Copied file! "+path5);
      }
      // Copy file data to stream
      //if(!Files.exists(path6)) {
        Files.copy(path6, out);
        System.out.println("Copied file! ");
      //}
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
