package CreationalDesignPattern.AbstractFactory.EconomicCars;

import CreationalDesignPattern.AbstractFactory.Car;

public class EconomicCar2 implements Car {
  @Override
  public int getTopSpeed() {
    return 100;
  }
}
