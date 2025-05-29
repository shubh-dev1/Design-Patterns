package StructuralDesignPattern.AdapterDesignPattern;

public class PaypalAdapter implements PaymentGateway {

  private PayPal paymentGateway;

  public PaypalAdapter(PayPal paymentGateway){
    this.paymentGateway = paymentGateway;
  }


  @Override
  public void processPayment(double amount) {
    paymentGateway.makePayment(amount);
  }
}
