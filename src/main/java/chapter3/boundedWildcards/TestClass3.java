package chapter3.boundedWildcards;
import java.util.*;
public class TestClass3 {
  public static void main(String[] args) {
    List<? extends Flyer> flyers = new ArrayList<>();
    //flyers.add(new Goose());
  }
}
