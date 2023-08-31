package exam1.rideable;

public class TestClassC {
  public static void main(String ... args) {
    Rideable rider = Car::new;
    Car vehicle = rider.getCar("MyCar");
  }
}
