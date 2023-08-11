package reading3rd.chapter3.comparable_p143;

public class Product implements Comparable<Product> {
  int id;
  String name;
  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Product)) {
      return false;
    }
    Product other = (Product) obj;
    return this.id == other.id;
  }

  @Override
  public int compareTo(Product obj) {
    return this.name.compareTo(obj.name);
  }
  public static void main(String ... args) {
  }
}
