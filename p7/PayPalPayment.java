package p7;

public class PayPalPayment extends Order {
    private Payment payment;

    public PayPalPayment(int id, String name, int qty, double price, Payment payment) {
        super(id, name, qty, price);
        this.payment = payment;
    }

    @Override
    public void displayOrderDetails() {
        double total = quantity * price;

        System.out.println("\n--- PayPal Payment ---");
        System.out.println("Order ID: " + orderId);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total: " + total);

        payment.processPayment();
    }
}