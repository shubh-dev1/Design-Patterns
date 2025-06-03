package BehavirolDesignPattern.StratergyDesignPattern;

public class StratergyPatternDemo {
  public static void main(String[] args) {
    StrategyContext context = new StrategyContext();

    context.setStratergy(new CreditCardPayment());
    context.executePayment(100);

    context.setStratergy(new PayPalPayment());
    context.executePayment(50);

    context.setStratergy(new BitcoinPayment());
    context.executePayment(222);
  }
}
