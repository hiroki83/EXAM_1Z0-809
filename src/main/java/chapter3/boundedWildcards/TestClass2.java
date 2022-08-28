import java.util.*;
public class TestClass2 {
  public static void main(String[] args) {
    List<? extends Bird> birds = new ArrayList<>();
    //List<? extends Bird> birds = new ArrayList<>();
    List<? extends Bird> birds2 = Arrays.asList(new Sparrow(), new Bird());
    //List<? extends Bird> sparrows = new ArrayList<Sparrow>();
    //List<? super Bird> birds = new ArrayList<Bird>();
    //birds.add(sparrows.get(0));
    //birds.add(new Sparrow());
    //birds.add(new Bird());
    //birds.addAll(birds2);
  }
  static class Bird {}
  static class Sparrow extends Bird {}
}
