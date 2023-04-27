package chapter8.streams.object;

import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;
import java.io.EOFException;
import java.io.IOException;

public class ObjectStreamSampleWithTransient {
  private static final String parent = "//Users//hirokiinoue//Practice1Z0809//src//main//resources//chapter8//streams//object//";
  public static List<AnimalWithTransient> getAnimals(File dataFile) throws IOException, ClassNotFoundException {
    List<AnimalWithTransient> animals = new ArrayList<AnimalWithTransient>();
    try (ObjectInputStream in = new ObjectInputStream(
          new BufferedInputStream(new FileInputStream(dataFile)))) {
      while(true) {
        Object object = in.readObject();
        if(object instanceof AnimalWithTransient)
          animals.add((AnimalWithTransient)object);
      }
    } catch (EOFException e) {
      System.out.println("File end reached");
    }
    return animals;
  }

  public static void createAnimalsFile(List<AnimalWithTransient> animals, File dataFile) throws IOException {
    try(ObjectOutputStream out = new ObjectOutputStream(
         new BufferedOutputStream(new FileOutputStream(dataFile)))) {
      for(AnimalWithTransient animal: animals)
        out.writeObject(animal);
    }
  }

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    List<AnimalWithTransient> animals = new ArrayList<AnimalWithTransient>();
    animals.add(new AnimalWithTransient("Peter Penguin", 8,'P'));
    animals.add(new AnimalWithTransient("Tommy Tiger", 5,'T'));

    File dataFile = new File(parent, "animal.data");
    createAnimalsFile(animals,dataFile);
    System.out.println(getAnimals(dataFile));
  }
}
