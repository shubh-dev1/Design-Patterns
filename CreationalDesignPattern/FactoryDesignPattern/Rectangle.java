package CreationalDesignPattern.FactoryDesignPattern;

public class Rectangle implements Shape{
  @Override
  public void computeArea() {
    System.out.println("Rectangle is called");
  }
}
