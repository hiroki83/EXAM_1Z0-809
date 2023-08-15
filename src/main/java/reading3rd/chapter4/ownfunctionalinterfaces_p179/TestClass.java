package reading3rd.chapter4.ownfunctionalinterfaces_p179;

public class TestClass {
  public static void main(String ... args) {
    TriFunction<Double, Double, Double, Double> t = (sp1, sp2, sp3) -> sp1*sp2*sp3/3/100;
    System.out.println(t.apply(3.13, 3.98, 4.12));
    QuadFunction<Double, Double, Double, Double, Double> q = (sp1, sp2, sp3, sp4) -> sp1*sp2*sp3*sp4/4/100;
    System.out.println(q.apply(3.13, 3.98, 4.12, 3.15));
  }
}
