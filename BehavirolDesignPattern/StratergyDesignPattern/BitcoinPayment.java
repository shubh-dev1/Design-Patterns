package BehavirolDesignPattern.StratergyDesignPattern;

public class BitcoinPayment implements PaymentStratergy{
  @Override
  public void pay(int amount) {
    System.out.println("Paid "+ amount +" via bitcoin");
  }
}
