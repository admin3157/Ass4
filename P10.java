import p10.shopping;
import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        shopping s = new shopping();

        System.out.println("Choose Option:");
        System.out.println("1. Price + Quantity");
        System.out.println("2. Price + Quantity + Discount");
        System.out.println("3. Only Price");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter Price: ");
            int price = sc.nextInt();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            s.calculateBill(price, qty);

        } else if (choice == 2) {
            System.out.print("Enter Price: ");
            int price = sc.nextInt();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Enter Discount (%): ");
            double discount = sc.nextDouble();

            s.calculateBill(price, qty, discount);

        } else if (choice == 3) {
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            s.calculateBill(price);

        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}