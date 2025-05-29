package CreationalDesignPattern.FactoryDesignPattern;

public class ShapeInstanceFactory {
  public Shape getShapeInstance(String value){
    return switch (value) {
      case "Circle" -> new Circle();
      case "Rectangle" -> new Rectangle();
      case "Square" -> new Sqaure();
      default -> null;
    };
  }
}
