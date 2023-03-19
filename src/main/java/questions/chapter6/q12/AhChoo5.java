package questions.chapter6.q12;

public class AhChoo5 {
  static class SneezeException extends Exception {}
  static class SniffleException extends SneezeException {}
  public static void main(String[] args) throws SneezeException {
    try {
      throw new SneezeException();
    } catch (SneezeException e) {
      e = new SniffleException();
      throw e;
    }
  }
}
