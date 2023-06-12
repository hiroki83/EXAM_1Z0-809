package bonus1.q29;

import java.util.List;
import java.util.ArrayList;
import java.io.EOFException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.File;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;

public class TestClass {
  public static void main(String ... args) {
    File dataFile = new File("");
    List<Donkey> donkeys = new ArrayList<Donkey>();
    try (ObjectInputStream in = new ObjectInputStream(
          //new BufferedInputStream(new FileReader(dataFile)))) {// DOES NOT COMPILE
          new BufferedInputStream(new FileInputStream(dataFile)))) {
      Object object = in.readObject();
      if(object instanceof Donkey)
        //donkeys.add(object);// DOES NOT COMPILE
        donkeys.add((Donkey) object);
    } catch(EOFException e) {
    } catch(FileNotFoundException e) {
    } catch(IOException e) {
    } catch(ClassNotFoundException e) {
    }
  }
}
class Donkey implements Serializable {}
