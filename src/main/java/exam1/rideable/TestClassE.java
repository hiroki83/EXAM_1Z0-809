package exam1.rideable;

import java.util.function.Supplier;
import java.util.function.Function;

public class TestClassE {
  public static void main(String ... args) {
    //Car auto = new Car(); // COMPILE ERROR
    Rideable rider = Car::new;
    //Supplier<Car> car = Car::new; // DOES NOT COMPILE
    //Supplier car = Car::new; // DOES NOT COMPILE
    Function<String, Car> func = Car::new;
    Car car1 = rider.getCar("Yaris");
    Car car2 = func.apply("Yaris Hybrid");
    System.out.println(car1 + " " + car2);
  }
}
