package CreationalDesignPattern.AbstractFactory;

import CreationalDesignPattern.AbstractFactory.EconomicCars.EconomicCar1;
import CreationalDesignPattern.AbstractFactory.EconomicCars.EconomicCar2;

public class EconomicCarFactory implements AbstractFactorie{
  @Override
  public Car getInstance(int price) {
    if(price <=3000000){
      return new EconomicCar1();
    }else if(price > 3000000){
      return new EconomicCar2();
    }
    return null;
  }
}
