package StructuralDesignPattern.BridgeDesignPattern;

public class DrawingAPI1 implements DrawingApi{

  @Override
  public void drawCircle(int x, int y, int radius) {
    System.out.printf("API1: Drawing circle at (%d, %d) with radius %d%n",x,y,radius);
  }
}
