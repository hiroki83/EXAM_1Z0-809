package chapter7.callable;

import java.util.function.Supplier;
import java.util.concurrent.Callable;
import java.io.IOException;

public class AmbiguousLambdaSample {
  public static void useCallable(Callable<Integer> expression) {}
  public static void useSupplier(Supplier<Integer> expression) {}

  public static void use(Supplier<Integer> expression) {}
  public static void use(Callable<Integer> expression) {}

  public static void main(String[] args) {
    useCallable(() -> {throw new IOException();});
    //useSupplier(() -> {throw new IOException();});// DOES NOT COMPILE
    use((Callable<Integer>)() -> {throw new IOException();});
  }
}
