package p10;

public class shopping {

    public void calculateBill(int price, int quantity) {
        double total = price * quantity;

        if (quantity > 10) {
            total -= total * 0.10;
            System.out.println("10% Discount Applied");
        }

        System.out.println("Total Bill: " + total);
    }

    public void calculateBill(int price, int quantity, double discount) {
        double total = price * quantity;

        total -= total * (discount / 100);

        System.out.println("Discount Applied: " + discount + "%");
        System.out.println("Total Bill: " + total);
    }

    public void calculateBill(double price) {
        System.out.println("Total Bill: " + price);
    }
}