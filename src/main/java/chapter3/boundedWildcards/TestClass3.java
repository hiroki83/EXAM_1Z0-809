package chapter3.boundedWildcards;
import java.util.*;
public class TestClass3 {
  public static void main(String[] args) {
    List<? extends Flyer> flyers = new ArrayList<>();
    List<Flyer> mixFlyers = Arrays.asList(new HangGlider(), new Goose());
    List<Goose> geese = Arrays.asList(new Goose(), new Goose());
    TestClass3 test = new TestClass3();
    test.anyFlyer(mixFlyers);
    //test.anyFlyer(geese);//DOES NOT COMPILE
    test.groupOfFlyers(mixFlyers);
    test.groupOfFlyers(geese);
  }

  private void anyFlyer(List<Flyer> flyer) {}
  private void groupOfFlyers(List<? extends Flyer> flyer) {}
}
