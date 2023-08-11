package reading3rd.chapter3.upperboundedwildcards_p119;

import java.util.List;
import java.util.Arrays;

public class TestClass3 {
  private void anyFlyer(List<Flyer> flyer) {}
  private void groupOfFlyer(List<? extends Flyer> flyer) {}
  public static void main(String ... args) {
    List<? extends Flyer> mixGroup = Arrays.asList(new Gooes(), new HangGlider());
    List<Flyer> mixGroup2 = Arrays.asList(new Gooes(), new HangGlider());
    List<Gooes> geese = Arrays.asList(new Gooes(), new Gooes());
    List<HangGlider> hangGliders = Arrays.asList(new HangGlider(), new HangGlider());
    TestClass3 t3 = new TestClass3();
    //t3.anyFlyer(mixGroup);// DOES NOT COMPILE
    t3.anyFlyer(mixGroup2);
    //t3.anyFlyer(geese);// DOES NOT COMPILE
    //t3.anyFlyer(hangGliders);// DOES NOT COMPILE
    t3.groupOfFlyer(mixGroup);
    t3.groupOfFlyer(mixGroup2);
    t3.groupOfFlyer(geese);
    t3.groupOfFlyer(hangGliders);
  }
}
