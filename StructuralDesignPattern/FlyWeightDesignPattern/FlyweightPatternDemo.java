package StructuralDesignPattern.FlyWeightDesignPattern;

public class FlyweightPatternDemo {
  public static void main(String[] args) {
    Shape redCircle1 = FlyweightFactory.getCircle("Red");
    redCircle1.draw(10,20);

    Shape redCircle2 = FlyweightFactory.getCircle("Red");
    redCircle2.draw(20,20);

    Shape blueCircle = FlyweightFactory.getCircle("Blue");
    blueCircle.draw(30,20);

  }
}
