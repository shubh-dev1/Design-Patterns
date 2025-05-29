package CreationalDesignPattern.FactoryDesignPattern;

public class Main {
  public static void main(String[] args) {
    ShapeInstanceFactory factory = new ShapeInstanceFactory();
    Shape shapeObj =  factory.getShapeInstance("Circle");
    shapeObj.computeArea();
  }
}
