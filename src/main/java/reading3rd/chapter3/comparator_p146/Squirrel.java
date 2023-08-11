package reading3rd.chapter3.comparator_p146;

public class Squirrel {
  private int weight;
  private String species;
  public Squirrel(String theSpecies, int weight) {
    if(theSpecies == null) throw new IllegalArgumentException();
    species = theSpecies;
    this.weight = weight;
  }
  @Override
  public String toString() {
    return "["+ this.species + ", "+weight+"]";
  }
  public int getWeight() { return weight;}
  public void setWeight(int weight) { this.weight = weight;}
  public String getSpecies() { return this.species;}
  public static void main(String ... args) {
  }
}
