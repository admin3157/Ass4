package p11;

public class MobileStore {

    static String storeName = "Mobile Store";

    public static void showStore() {
        System.out.println("\nWelcome to " + storeName);
    }

    public void calculatePrice(int price) {
        System.out.println("Total Price: " + price);
    }

    public void calculatePrice(int price, int quantity) {
        int total = price * quantity;

        if (quantity > 10) {
            total = total - (total * 10 / 100);
            System.out.println("10% Discount Applied");
        }

        System.out.println("Total Price: " + total);
    }
}