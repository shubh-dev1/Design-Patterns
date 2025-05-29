package StructuralDesignPattern.AdapterDesignPattern;

public class Stripe {

  public void makePayment(double amount){
    System.out.println("Paid $ "+amount+" via stripe" );
  }
}
