package StructuralDesignPattern.DecoratorPattern;

public class PeproniDecorator extends PizzaDecorator{
  public PeproniDecorator(Pizza pizza){
    super(pizza);
  }

  @Override
  public String getDescription() {
    return decoratedPizza.getDescription() +",Pepperoni";
  }

  @Override
  public double getCost() {
    return decoratedPizza.getCost() + 2.0;
  }
}
