package StructuralDesignPattern.BridgeDesignPattern;

public class Circle extends Shape{

  private int x,y,radius;

  public Circle(int x,int y,int radius,DrawingApi drawingApi){
    super(drawingApi);
    this.x = x;
    this.y = y;
    this.radius = radius;
  }
  @Override
  void draw() {
    drawingApi.drawCircle(x,y,radius);
  }
}
