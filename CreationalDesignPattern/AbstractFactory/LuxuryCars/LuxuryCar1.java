package CreationalDesignPattern.AbstractFactory.LuxuryCars;

import CreationalDesignPattern.AbstractFactory.Car;



public class LuxuryCar1 implements Car {
  @Override
  public int getTopSpeed() {
    return 300;
  }
}
