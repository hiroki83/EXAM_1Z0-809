package chapter3.boundedWildcards;
import java.util.*;
public class TestClass3 {
  public static void main(String[] args) {
    List<? extends Flyer> flyers = new ArrayList<>();
    List<Flyer> mixFlyers = new ArrayList<>();
    mixFlyers.add(new Goose());
    mixFlyers.add(new HangGlider());
    List<Goose> geese = Arrays.asList(new Goose(), new Goose());
    List<HangGlider> hangGliders = Arrays.asList(new HangGlider(), new HangGlider());
    TestClass3 test = new TestClass3();
    test.anyFlyer(mixFlyers);
    //test.anyFlyer(geese);//DOES NOT COMPILE
    //test.anyFlyer(hangGliders);//DOES NOT COMPILE
    //test.anyFlyer(flyers);//DOES NOT COMPILE
    test.groupOfFlyers(mixFlyers);
    test.groupOfFlyers(geese);
    test.groupOfFlyers(hangGliders);
    test.groupOfFlyers(flyers);
  }

  private void anyFlyer(List<Flyer> flyer) {}
  private void groupOfFlyers(List<? extends Flyer> flyer) {}
}
