import p11.MobileStore;
import java.util.Scanner;

public class P11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MobileStore m = new MobileStore();

        int choice;

        do {
            MobileStore.showStore();

            System.out.println("1. Single Mobile");
            System.out.println("2. Multiple Mobiles");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter price: ");
                int price = sc.nextInt();
                m.calculatePrice(price);

            } else if (choice == 2) {
                System.out.print("Enter price: ");
                int price = sc.nextInt();

                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();

                m.calculatePrice(price, qty);

            } else if (choice == 3) {
                System.out.println("Thank you!");
            } else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}