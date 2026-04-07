import java.util.Scanner;

import Q22.SmartBank;

class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartBank bank = new SmartBank();

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        bank.deposit(dep);

        System.out.print("Enter monthly salary: ");
        double sal = sc.nextDouble();
        bank.calculateLoanEligibility(sal);

        System.out.println("---------------------------");
        bank.showBalance();

        sc.close();
    }
}