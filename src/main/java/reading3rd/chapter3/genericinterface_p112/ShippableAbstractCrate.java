package reading3rd.chapter3.genericinterface_p112;

public class ShippableAbstractCrate<U> implements Shippable<U> {
  public void ship(U u) {}
}
