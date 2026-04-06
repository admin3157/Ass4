import p3.Account;
import p3.CurrentAccount;
import p3.SavingsAccount;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Savings Account
        SavingsAccount sa = new SavingsAccount();
        System.out.println("Enter Savings Account Details:");
        System.out.print("Name: ");
        sa.accountHolderName = sc.nextLine();

        System.out.print("Balance: ");
        sa.balance = sc.nextDouble();

        System.out.print("Interest Rate: ");
        sa.interestRate = sc.nextDouble();

        System.out.println("\n--- Savings Account Details ---");
        sa.showDetails();

        // Current Account
        CurrentAccount ca = new CurrentAccount();
        sc.nextLine(); // clear buffer

        System.out.println("\nEnter Current Account Details:");
        System.out.print("Name: ");
        ca.accountHolderName = sc.nextLine();

        System.out.print("Balance: ");
        ca.balance = sc.nextDouble();

        System.out.print("Withdrawal Amount: ");
        ca.withdrawalAmount = sc.nextDouble();

        System.out.println("\n--- Current Account Details ---");
        ca.showDetails();

        sc.close();
    }
}