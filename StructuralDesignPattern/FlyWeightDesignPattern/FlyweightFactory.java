package StructuralDesignPattern.FlyWeightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
  private static final Map<String,Shape> circleMap = new HashMap<>();
  public static Shape getCircle(String color){
    circleMap.putIfAbsent(color,new Circle(color));
    return circleMap.get(color);
  }
}
