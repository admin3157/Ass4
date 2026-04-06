package p3;

public class CurrentAccount extends Account {
    public double withdrawalAmount;

    @Override
    public void showDetails() {
        super.showDetails();

        if (balance >= withdrawalAmount) {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal Successful: " + withdrawalAmount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}