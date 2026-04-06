package p3;

public class SavingsAccount extends Account {
    public double interestRate;

    @Override
    public void showDetails() {
        super.showDetails();

        if (balance >= 5000) {
            double interest = balance * interestRate / 100;
            System.out.println("Interest Rate: " + interestRate + "%");
            System.out.println("Interest Amount: " + interest);
        } else {
            System.out.println("Balance too low for interest");
        }
    }
}