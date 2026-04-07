package Q22;

public class SmartBank implements AccountOperations, LoanService {
    public double balance;

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void calculateLoanEligibility(double salary) {
        System.out.println("--- Loan Assessment ---");
        if (salary >= 30000) {
            System.out.println("Loan Status: Eligible (High Income Bracket)");
        } else {
            System.out.println("Loan Status: Not Eligible (Minimum requirement: 30,000)");
        }
    }

    public void showBalance() {
        System.out.println("Total Balance: " + balance);
    }
}