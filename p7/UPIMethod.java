package p7;

public class UPIMethod extends Payment {

    public UPIMethod(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {   // ✅ fixed
        System.out.println("Payment done using UPI: " + amount);
    }
}