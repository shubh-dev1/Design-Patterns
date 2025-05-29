package StructuralDesignPattern.AdapterDesignPattern;

public class PaymentApp {

  public static void main(String[] args) {
    PaymentGateway payPalGateway = new PaypalAdapter(new PayPal());
    PaymentGateway stripeGateway = new StripeAdapter(new Stripe());

    double amount = 100.0;

    // process payment using different payment gateways
    payPalGateway.processPayment(amount);
    stripeGateway.processPayment(amount);
  }
}
