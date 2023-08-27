package bonus3.q37;

import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.EOFException;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.File;

public class TestClass {
  public static void main(String ... args) throws IOException, ClassNotFoundException {
    List<Whale> whales = new ArrayList<>();
    whales.add(new Whale());
    File dataFile = new File("/Users/hirokiinoue/git_repositories/EXAM_1Z0-809/src/main/resources/bonus3/q37/whale.data");
    createWhalesFile(whales,dataFile);
    System.out.println(getWhales(dataFile));
  }

  public static void createWhalesFile(List<Whale> whales, File dataFile) throws IOException {
    try (ObjectOutputStream out = new ObjectOutputStream(
          new BufferedOutputStream(new FileOutputStream(dataFile)))) {
      for(Whale whale : whales)
        out.writeObject(whale);
    }
  }

  public static List<Whale> getWhales(File dataFile) throws IOException, ClassNotFoundException {
    List<Whale> whales = new ArrayList<>();
    try (ObjectInputStream in = new ObjectInputStream(
          new BufferedInputStream(new FileInputStream(dataFile)))) {
      while(true) {
        Object object = in.readObject();
        if(object instanceof Whale)
          whales.add((Whale)object);
      }
    } catch (EOFException e) {
      e.printStackTrace();
    }
    return whales;
  }
}
