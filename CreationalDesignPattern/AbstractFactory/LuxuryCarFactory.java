package CreationalDesignPattern.AbstractFactory;

import CreationalDesignPattern.AbstractFactory.LuxuryCars.LuxuryCar1;
import CreationalDesignPattern.AbstractFactory.LuxuryCars.LuxuryCar2;

public class LuxuryCarFactory implements AbstractFactorie {
  @Override
  public Car getInstance(int price) {
    if(price <= 5000000){
      return new LuxuryCar1();
    }else if(price > 5000000){
      return new LuxuryCar2();
    }
    return null;
  }
}
