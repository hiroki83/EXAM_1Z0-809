package bonus1.q59;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.EOFException;

public class Dolphin {// be thrown NotSerializableException
//public class Dolphin implements Serializable {
  private transient String name = "Flipper";
  //private String name = "Flipper";
  private static String birthPlace = "ocean";
  private transient int age;
  private java.util.List<Dolphin> friends = new java.util.ArrayList<>();
  public static void main(String ... args) {
    List<Dolphin> dolphins = new ArrayList<Dolphin>();
    Dolphin dolphin1 = new Dolphin();
    Dolphin dolphin2 = new Dolphin();
    dolphin1.setName("Hiroki");
    dolphin1.setAge(39);
    dolphin1.setBirthPlace("Nousa");
    dolphin1.setFriends(Arrays.asList(dolphin2));
    dolphin2.setName("Yasu");
    dolphin2.setAge(39);
    dolphin2.setBirthPlace("Hoshika");
    dolphin2.setFriends(Arrays.asList(dolphin1));
    dolphins.add(dolphin1);
    dolphins.add(dolphin2);
    
    File dataFile = new File("/Users/hirokiinoue/git_repositories/EXAM_1Z0-809/src/main/resources/bonus1/q59/dolphin.data");
    createDolphinsFile(dolphins,dataFile);
    System.out.println(getDolphins(dataFile));
  }
  public static List<Dolphin> getDolphins(File dataFile) {
    List<Dolphin> dolphins = new ArrayList<Dolphin>();
    try (ObjectInputStream in = new ObjectInputStream(
           new BufferedInputStream(new FileInputStream(dataFile)))) {
      while(true) {
        Object object = in.readObject();
        if(object instanceof Dolphin)
          dolphins.add((Dolphin)object);
      }
    } catch(EOFException e) {
      //e.printStackTrace();
    } catch(IOException e) {
      e.printStackTrace();
    } catch(ClassNotFoundException e) {
      e.printStackTrace();
    }
    return dolphins;
  }
  public static void createDolphinsFile(List<Dolphin> dolphins, File dataFile) {
    try (ObjectOutputStream out = new ObjectOutputStream(
           new BufferedOutputStream(new FileOutputStream(dataFile)))) {
      for(Dolphin dolphin: dolphins)
        out.writeObject(dolphin);
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getBirthPlace() {
    return this.birthPlace;
  }
  public void setBirthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
  }
  public int getAge() {
    return this.age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public List<Dolphin> getFriends() {
    return this.friends;
  }
  public void setFriends(List<Dolphin> friends) {
    this.friends = friends;
  }
  @Override
  public String toString() {
    return "Name: " + this.name + ", Age: " + this.age + ", BirthPlace: " + this.birthPlace;
  }
}
