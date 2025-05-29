package CreationalDesignPattern.AbstractFactory.EconomicCars;

import CreationalDesignPattern.AbstractFactory.Car;

public class EconomicCar1 implements Car {
  @Override
  public int getTopSpeed() {
    return 150;
  }
}
