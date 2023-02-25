package chapter3.genericinterfaces;

public interface Shippable<T> {
  void ship(T t);
}
