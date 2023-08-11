package reading3rd.chapter3.diamondoperator_p108;

import java.util.List;
import java.util.ArrayList;

public class Doggies {
  List<String> names;
  Doggies() {
    names = new ArrayList<>();
  }
  public void copyNames() {
    ArrayList<String> copyOfNames;
    copyOfNames = new ArrayList<>();
  }
  public static void main(String ... args) {
    Doggies doggies = new Doggies();
    doggies.copyNames();
  }
}
