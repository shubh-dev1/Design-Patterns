package StructuralDesignPattern.AdapterDesignPattern;

public class StripeAdapter implements PaymentGateway{

  private Stripe paymentGateway;

  public StripeAdapter(Stripe paymentGateway){
    this.paymentGateway = paymentGateway;
  }
  @Override
  public void processPayment(double amount) {
    paymentGateway.makePayment(amount);
  }


}
