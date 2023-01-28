package questions.chapter1.q17;

public enum AnimalClasses {
  //MAMMAL(true), FISH(Boolean.FALSE), BIRD(false),REPILE(false), AMPHIBIAN(false), INVERTEBRATE(false) COMPILE ERROR missing semicolon
  MAMMAL(true), FISH(Boolean.FALSE), BIRD(false),REPILE(false), AMPHIBIAN(false), INVERTEBRATE(false);
  boolean hasHair;
  //public AnimalClasses(boolean hasHair) { COMPILE ERROR A constructor in Enum is not allowd the modifer public
  private AnimalClasses(boolean hasHair) {
    this.hasHair = hasHair;
  }
  public void giveWig() {
    hasHair = true;
  }
}
