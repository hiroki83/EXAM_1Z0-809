package reading3rd.chapter7.forkjoin_p382;

public class TestClassRecursive {
  public static void main(String ... args) {
    System.out.println(factorial(5));
  }
  public static int factorial(int n) {
    if(n<=1) return 1;
    else return n * factorial(n-1);
  }
}
