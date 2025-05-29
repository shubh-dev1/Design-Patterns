package StructuralDesignPattern.DecoratorPattern;

public class PlainPizza implements Pizza{
  @Override
  public String getDescription() {
    return "Plain Pizza";
  }

  @Override
  public double getCost() {
    return 5.0;
  }
}
