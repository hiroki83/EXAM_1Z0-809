package chapter2.designpatterns.singleton.realworldscenario;

public class VisitorTicketTracker {
  private volatile static VisitorTicketTracker instance;
  private VisitorTicketTracker() {
  }
  public static VisitorTicketTracker getInstance() {
    if(instance == null) {
      synchronized(VisitorTicketTracker.class) {
        if(instance == null) {
          instance = new VisitorTicketTracker(); 
        }
      }
    }
    return instance;
  }
}
