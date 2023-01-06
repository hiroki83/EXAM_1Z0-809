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

public class ObjectStreamSample {
  private static final String parent = "//Users//hirokiinoue//Practice1Z0809//src//main//resources//chapter8//streams//object//";
  public static List<Animal> getAnimals(File dataFile) throws IOException, ClassNotFoundException {
    List<Animal> animals = new ArrayList<Animal>();
    try (ObjectInputStream in = new ObjectInputStream(
          new BufferedInputStream(new FileInputStream(dataFile)))) {
      while(true) {
        Object object = in.readObject();
        if(object instanceof Animal)
          animals.add((Animal)object);
      }
    } catch (EOFException e) {
      System.out.println("File end reached");
    }
    return animals;
  }

  public static void createAnimalsFile(List<Animal> animals, File dataFile) throws IOException {
    try(ObjectOutputStream out = new ObjectOutputStream(
         new BufferedOutputStream(new FileOutputStream(dataFile)))) {
      for(Animal animal: animals)
        out.writeObject(animal);
    }
  }

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    List<Animal> animals = new ArrayList<Animal>();
    animals.add(new Animal("Tommy Tiger", 5,'T'));
    animals.add(new Animal("Peter Penguin", 8,'P'));

    File dataFile = new File(parent, "animal.data");
    createAnimalsFile(animals,dataFile);
    System.out.println(getAnimals(dataFile));
  }
}
