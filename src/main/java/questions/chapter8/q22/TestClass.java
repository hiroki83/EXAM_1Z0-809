package questions.chapter8.q22;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.EOFException;

public class TestClass {
  public static void main(String ... args) throws IOException, ClassNotFoundException {
    Eagle eagle = new Eagle();
    File dataFile = new File("bird_eagle.data");
    createBirdFile(eagle, dataFile);
    System.out.println(getBird(dataFile).getName());
  }
  public static void createBirdFile(Eagle eagle, File dataFile) throws IOException {
    try (ObjectOutputStream out = new ObjectOutputStream(
      new BufferedOutputStream(new FileOutputStream(dataFile)))) {
      out.writeObject(eagle);
    }
  }
  public static Eagle getBird(File dataFile) throws IOException, ClassNotFoundException {
    Eagle returnObject = null;
    try (ObjectInputStream in = new ObjectInputStream(
      new BufferedInputStream(new FileInputStream(dataFile)))) {
      while(true) {
        Object object = in.readObject();
        if (object instanceof Eagle)
          returnObject = (Eagle) object;
      }
    } catch (EOFException e) {
      // File end reached
    }
    return returnObject;
  }
}
