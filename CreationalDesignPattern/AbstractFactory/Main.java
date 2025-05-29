package CreationalDesignPattern.AbstractFactory;

public class Main {
  public static void main(String[] args) {
    AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();
    AbstractFactorie carFactory = abstractFactoryProducer.getAbstractFactory("Economic");
    Car carObj = carFactory.getInstance(50000);
    System.out.println(carObj.getTopSpeed());
  }
}
