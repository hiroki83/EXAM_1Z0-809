package bonus3.q37;

import java.io.Serializable;

//public class Creature {
public class Creature implements Serializable {
  protected transient String name;
  protected transient int age = 10;
  protected static char type = 'C';
}
