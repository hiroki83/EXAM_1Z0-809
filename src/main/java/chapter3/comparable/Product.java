package chapter3.comparable;

public class Product implements Comparable<Product> {
  int id;
  String name;

  public boolean equals(Object obj) {
    if(!(obj instanceof Product)) {
      return false;
    }
    Product other = (Product) obj;
    return this.id == other.id;
  }
  public int compareTo(Product obj) {
    return this.name.compareTo(obj.name);
  }
  public static void main(String[] args) {
    Product p1 = new Product();
    Product p2 = new Product();
    p1.id = 1;
    p1.name = "P1";
    p2.id = 2;
    p2.name = "P1";
    System.out.println(p1.equals(p2));
    System.out.println(p1.compareTo(p2));
  }
}
