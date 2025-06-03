package BehavirolDesignPattern.StratergyDesignPattern;

public class StrategyContext {
  private PaymentStratergy stratergy;

  public void setStratergy(PaymentStratergy stratergy){
    this.stratergy = stratergy;
  }

  public void executePayment(int amount){
    stratergy.pay(amount);
  }
}
