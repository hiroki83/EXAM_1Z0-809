package bonus3.q54;

public enum Suit {
  SPADE(Color.BLACK), HEART(Color.RED),
  DIAMOMD(Color.RED), CLUB(Color.BLACK), HIROKI(Color.YELLOW);

  private enum Color { RED, BLACK, YELLOW; }
  private Suit(Color c) { color = c;}
  public Color color;
}
