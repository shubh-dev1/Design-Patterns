package BehavirolDesignPattern.StratergyDesignPattern;

public class PayPalPayment implements PaymentStratergy{
  @Override
  public void pay(int amount) {
    System.out.println("Paid "+ amount +" via PayPal");
  }
}
