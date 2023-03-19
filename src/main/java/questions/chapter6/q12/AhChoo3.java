package questions.chapter6.q12;

public class AhChoo3 {
  static class SneezeException extends Exception {}
  static class SniffleException extends SneezeException {}
  public static void main(String[] args) throws SneezeException {
    try {
      throw new SneezeException();
    } catch (SneezeException e) {
      //e = new RuntimeException();//DOES NOT COMPILE
      throw e;
    }
  }
}
