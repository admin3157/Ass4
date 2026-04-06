import p7.CreditCardMethod;
import p7.CreditCardPayment;
import p7.Order;
import p7.PayPalMethod;
import p7.PayPalPayment;
import p7.UPIMethod;
import p7.UPIPayment;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Order ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        double total = qty * price;

        System.out.println("\nChoose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. UPI");

        int choice = sc.nextInt();

        Order order = null;

        if (choice == 1) {
            order = new CreditCardPayment(id, name, qty, price, new CreditCardMethod(total));
        } else if (choice == 2) {
            order = new PayPalPayment(id, name, qty, price, new PayPalMethod(total));
        } else if (choice == 3) {
            order = new UPIPayment(id, name, qty, price, new UPIMethod(total));
        } else {
            System.out.println("Invalid Choice");
            System.exit(0);
        }

        System.out.println("\n--- Order Details ---");
        order.displayOrderDetails();

        sc.close();
    }
}