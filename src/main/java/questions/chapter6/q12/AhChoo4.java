package questions.chapter6.q12;

public class AhChoo4 {
  static class SneezeException extends Exception {}
  static class SniffleException extends SneezeException {}
  public static void main(String[] args) throws SneezeException {
    try {
      throw new SneezeException();
    } catch (SneezeException e) {
      e = new SneezeException();
      throw e;
    }
  }
}
