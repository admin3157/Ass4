package p7;

public abstract class Order {
    public int orderId;
    public String productName;
    public int quantity;
    public double price;

    public Order(int orderId, String productName, int quantity, double price) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public abstract void displayOrderDetails();
}