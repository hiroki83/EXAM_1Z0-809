package reading3rd.chapter3.setmethods_p133;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class TestClass {
  public static void main(String ... args) {
    Set<Integer> set = new HashSet<>();
    boolean b1 = set.add(66);
    System.out.println(set.hashCode());
    boolean b2 = set.add(10);
    System.out.println(set.hashCode());
    boolean b3 = set.add(66);
    System.out.println(set.hashCode());
    boolean b4 = set.add(8);
    System.out.println(set.hashCode());
    
    for (Integer integer: set) System.out.println(integer + ",");

    Set<Integer> treeSet = new TreeSet<>();
    boolean b5 = treeSet.add(66);
    boolean b6 = treeSet.add(10);
    boolean b7 = treeSet.add(66);
    boolean b8 = treeSet.add(8);
    for (Integer integer: treeSet) System.out.println(integer + ",");
  }
}
