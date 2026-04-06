package p1;

public class Product extends Website {
    String productName = "Laptop";
    double price = 50000;

    public void showProduct() {
        showWebsite();
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
    }
}