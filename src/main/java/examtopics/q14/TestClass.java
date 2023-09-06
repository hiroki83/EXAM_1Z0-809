package examtopics.q14;

public class TestClass {
  void doStuff() throws ArithmeticException, NumberFormatException, Exception {
    if (Math.random() > -1)
      throw new Exception("Try again");
  }
  public static void main(String ... args) {
    TestClass t = new TestClass();
    try {
      t.doStuff();
    //} catch (ArithmeticException | NumberFormatException | Exception e) {
    } catch (ArithmeticException | NumberFormatException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
