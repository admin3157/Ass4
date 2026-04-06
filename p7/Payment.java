package p7;

public abstract class Payment {
    protected double amount;   // ✅ Added variable

    public Payment(double amount) {   // ✅ Added constructor
        this.amount = amount;
    }

    public abstract void processPayment();
}