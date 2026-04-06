package p7;

public class PayPalMethod extends Payment {

    public PayPalMethod(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {   // ✅ fixed
        System.out.println("Payment done using PayPal: " + amount);
    }
}