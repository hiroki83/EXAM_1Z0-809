package bonus3.q27;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TestClassF {
  //public static <? extends Set> Set work(Set t) { // DOES NOT COMPILE
  public static <T> T work(List<? extends T> t) {
    return t.get(0);
  }

  public static void main(String ... args) {
    //String s = TestClassF.<String>work(new ArrayList<String>());
    //String s = work(Arrays.asList(""));
    //String s = work(Arrays.asList(1)); // DOES NOT COMPILE
    int i = work(Arrays.asList(1));
  }
}
