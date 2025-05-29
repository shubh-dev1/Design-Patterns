package StructuralDesignPattern.BridgeDesignPattern;

public class DrawingMain {
  public static void main(String[] args) {
    DrawingApi api1 = new DrawingAPI1();
    DrawingApi api2 = new DrawingAPI2();

    Shape circle = new Circle(1,2,3,api1);

    circle.draw();
  }
}
