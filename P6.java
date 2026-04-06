import p6.Account;
import p6.Transaction;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Transaction t = new Transaction();

        System.out.print("Enter Account Number: ");
        t.accountNumber = sc.nextInt();

        System.out.print("Enter Balance: ");
        t.balance = sc.nextDouble();

        System.out.print("Enter Withdraw Amount: ");
        t.withdrawAmount = sc.nextDouble();

        System.out.println("\n--- Account Details ---");
        t.showAccount();

        System.out.println("\n--- Transaction ---");
        t.withdraw();

        sc.close();
    }
}