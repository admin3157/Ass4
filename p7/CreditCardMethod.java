package p7;

public class CreditCardMethod extends Payment {

    public CreditCardMethod(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {   // ✅ made public
        System.out.println("Payment done using Credit Card: " + amount);
    }
}