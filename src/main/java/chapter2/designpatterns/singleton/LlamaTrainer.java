package chapter2.designpatterns.singleton;

public class LlamaTrainer {
  public boolean feedLlamas(int numberOfLlamas) {
    int amountNeeded = 5 * numberOfLlamas;
    HayStorage hayStorage = HayStorage.getInstance();
    if(hayStorage.getHayQuantity() < amountNeeded) {
      hayStorage.addHay(amountNeeded + 10);
    }
    boolean fed = hayStorage.removeHay(amountNeeded);
    if(fed) System.out.println("Llamas have been fed");
    return fed;
  }
  public static void main(String[] args) {
    LlamaTrainer llamaTrainer = new LlamaTrainer();
    llamaTrainer.feedLlamas(2);
  }
}
