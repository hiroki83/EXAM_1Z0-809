package assessment.question3;
import java.io.*;
//public class Tail {}//DOES NOT COMPILE
class Tail {}
public class Bird implements Serializable {
  private String name;
  private transient int age;
  private Tail tail;

  public String getName() { return name; }
  public Tail getTail() { return tail;}
  public void setName(String name) { this.name = name; }
  public void setSet(Tail tail) { this.tail = tail; }
  public int getAge() { return age; }
  public void setAge(int age) { this.age = age; }

  //public void main(String[] args) {//DOES NOT COMPILE
  public void main(String[] args) throws IOException, ClassNotFoundException {
    //try(InputStream is = new ObjectInputStream(new BufferedInputStream(new FileInputStream("birds.dat")))) {//DOES NOT COMPILE
    try(ObjectInputStream is = new ObjectInputStream(new BufferedInputStream(new FileInputStream("birds.dat")))) {
      //Bird bird = is.readObject();//DOES NOT COMPILE
      Bird bird = (Bird) is.readObject();
    }
  }
}
