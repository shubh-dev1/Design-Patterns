package StructuralDesignPattern.BridgeDesignPattern;

public class DrawingAPI2 implements DrawingApi{

  @Override
  public void drawCircle(int x, int y, int radius) {
    System.out.printf("API2: Drawing circle at (%d, %d) with radius %d%n",x,y,radius);
  }
}
