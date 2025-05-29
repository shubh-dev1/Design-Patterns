package StructuralDesignPattern.BridgeDesignPattern;

public abstract class Shape {
  protected DrawingApi drawingApi;
  protected Shape(DrawingApi drawingApi){
    this.drawingApi = drawingApi;
  }

  abstract void draw();
}
