package CreationalDesignPattern.FactoryDesignPattern;

public class Circle implements Shape{
  @Override
  public void computeArea() {
    System.out.println("Circle is called");
  }
}
