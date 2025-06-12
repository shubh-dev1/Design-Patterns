package BehavirolDesignPattern.VisitorDesignPattern;

public class VisitorPatternDemo {
  public static void main(String[] args) {
    Product book = new Book("Design Pattern");
    Product electronics = new Electronics("Smartphone");

    Visitor discountVisitor = new DiscountVisitor();
    book.accept(discountVisitor);
    electronics.accept(discountVisitor);
  }
}
