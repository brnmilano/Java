package ConditionalStructure;

public class ScopeAndInitialization {
  public static void main(String[] args) {
    double price = 400.00;
    double discount;

    if (price < 200.00) {
      discount = price * 0.1;
    } else {
      discount = price * 0.05;
    }

    System.out.println(discount);
  }
}
