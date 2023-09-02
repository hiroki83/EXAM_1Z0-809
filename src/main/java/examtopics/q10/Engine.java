package examtopics.q10;

import examtopics.q10.subdirectory.Operator2;
import examtopics.q10.subdirectory.Operator3;
import examtopics.q10.subdirectory.EngineOperator3;

public class Engine {
  Operator m = new EngineOperator();
  public void operate() {
    m.turnON();
    m.turnOFF();
  }
  Operator2 m2 = new Operator2();
  public void operateA() {
    //m2.turnON(); // DOES NOT COMPILE	
    //m2.turnOFF(); // DOES NOT COMPILE
    //m2.breakTime(); // DOES NOT COMPILE
  }
  Operator3 m3 = new EngineOperator3();
  public void operate3() {
    //m3.turnON(); // DOES NOT COMPILE	
    //m3.turnOFF(); // DOES NOT COMPILE
  }
}
