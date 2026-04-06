package p1;

public class Order extends Product {
    int quantity = 1;
    double totalAmount;
    double deliveryCharge;

    // Method Overriding
    @Override
    public void showProduct() {
        super.showProduct();

        totalAmount = price * quantity;

        if (totalAmount >= 2000) {
            deliveryCharge = 0;
        } else {
            deliveryCharge = 100;
        }

        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Delivery Charge: " + deliveryCharge);
    }
}