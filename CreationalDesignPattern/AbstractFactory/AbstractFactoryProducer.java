package CreationalDesignPattern.AbstractFactory;

public class AbstractFactoryProducer {
  public AbstractFactorie getAbstractFactory(String value){
    if(value.equals("Economic")){
      return new EconomicCarFactory();
    }else if(value.equals("Premium") || value.equals("Luxury")){
      return new LuxuryCarFactory();
    }
    return null;
  }
}
