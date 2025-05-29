package StructuralDesignPattern.AdapterDesignPattern;

public class PayPal {
   public void makePayment(double amount){
     System.out.println("Paid $ "+amount+" via paypal" );
   }
}
