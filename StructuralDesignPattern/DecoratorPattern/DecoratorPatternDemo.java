package StructuralDesignPattern.DecoratorPattern;

public class DecoratorPatternDemo{
  public static void main(String[] args) {
    Pizza piza = new PlainPizza();

    piza = new CheeseDecorator(piza);
    piza = new PeproniDecorator(piza);

    System.out.println("Description "+ piza.getDescription());
    System.out.println("Cost "+ piza.getCost());
  }
}
