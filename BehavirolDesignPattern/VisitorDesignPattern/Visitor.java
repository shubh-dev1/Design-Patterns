package BehavirolDesignPattern.VisitorDesignPattern;



public interface Visitor {
  void visit(Book book);
  void visit(Electronics electronics);
}
