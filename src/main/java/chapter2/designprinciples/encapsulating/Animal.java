package chapter2.designprinciples.encapsulating;

public class Animal {
  private String species;
  private int age;
  public Animal(String species, int age) {
    //checkSpecies(species);
    //checkAge(age);
    this.setSpecies(species);
    this.setAge(age);
  }
  public String getSpecies() {
    return this.species;
  }
  public void setSpecies(String species) {
    checkSpecies(species);
    this.species = species;
  }
  public int getAge() {
    return this.age;
  }
  public void setAge(int age) {
    checkAge(age);
    this.age = age;
  }
  private void checkSpecies(String species) {
    //if (species == null || "".equals(species)) throw new IllegalArgumentException("species field not allowed null or empty");//species field non-null and non-empty
    if (species == null || species.trim().length()==0) throw new IllegalArgumentException("species field not allowed null or empty");//species field non-null and non-empty
  }
  private void checkAge(int age) {
    if (age < 0) throw new IllegalArgumentException("age field must be greater than or equal to zero");//age field is greater than or equal to zero
  }
}
