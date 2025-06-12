package BehavirolDesignPattern.VisitorDesignPattern;

public class DiscountVisitor implements Visitor{
  @Override
  public void visit(Book book) {
    System.out.println("Applying 10% discount on Book : "+ book.getTitle());
  }

  @Override
  public void visit(Electronics electronics) {
    System.out.println("Applying 20% dicsount on Electronics :"+ electronics.getName());
  }
}
