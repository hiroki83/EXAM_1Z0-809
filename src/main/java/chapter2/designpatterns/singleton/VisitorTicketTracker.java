package chapter2.designpatterns.singleton;

// Lasy instantiation
public class VisitorTicketTracker {
  private static VisitorTicketTracker instance;
  private VisitorTicketTracker() {
  }
  //public static VisitorTicketTracker getInstance() {// NOT THREAD-SAFE !
  public static synchronized VisitorTicketTracker getInstance() {
    if(instance == null) {
      instance = new VisitorTicketTracker(); 
    }
    return instance;
  }
}
