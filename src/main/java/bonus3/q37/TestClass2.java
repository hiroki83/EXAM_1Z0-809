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

public class TestClass2 {
  public static void main(String ... args) throws IOException, ClassNotFoundException {
    List<Whale2> whales = new ArrayList<>();
    whales.add(new Whale2());
    File dataFile = new File("/Users/hirokiinoue/git_repositories/EXAM_1Z0-809/src/main/resources/bonus3/q37/whale2.data");
    createWhalesFile(whales,dataFile);
    System.out.println(getWhales(dataFile));
  }

  public static void createWhalesFile(List<Whale2> whales, File dataFile) throws IOException {
    try (ObjectOutputStream out = new ObjectOutputStream(
          new BufferedOutputStream(new FileOutputStream(dataFile)))) {
      for(Whale2 whale : whales)
        out.writeObject(whale);
    }
  }

  public static List<Whale2> getWhales(File dataFile) throws IOException, ClassNotFoundException {
    List<Whale2> whales = new ArrayList<>();
    try (ObjectInputStream in = new ObjectInputStream(
          new BufferedInputStream(new FileInputStream(dataFile)))) {
      while(true) {
        Object object = in.readObject();
        if(object instanceof Whale2)
          whales.add((Whale2)object);
      }
    } catch (EOFException e) {
      e.printStackTrace();
    }
    return whales;
  }
}
