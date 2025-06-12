package BehavirolDesignPattern.VisitorDesignPattern;

public class Electronics implements Product {

  private String name;
  public Electronics(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
