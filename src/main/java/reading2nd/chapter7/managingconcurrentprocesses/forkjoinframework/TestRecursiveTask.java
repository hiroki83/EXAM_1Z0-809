package reading2nd.chapter7.managingconcurrentprocesses.forkjoinframework;

import java.math.BigInteger;

public class TestRecursiveTask {
  public static void main(String ... args) {
    //System.out.println(factorial(Integer.parseInt(args[0])));
    //System.out.println(factorial(Long.parseLong(args[0])));
    System.out.println(factorial(new BigInteger(args[0])));
  }
  public static BigInteger factorial(BigInteger n) {
    if(n.compareTo(new BigInteger("1"))!=1) return new BigInteger("1");
    else return n.multiply(factorial(n.subtract(new BigInteger("1"))));
  }
}
