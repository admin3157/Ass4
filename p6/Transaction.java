package p6;

public class Transaction extends Account {
    public double withdrawAmount;

    public void withdraw() {
        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
            System.out.println("Withdrawal Successful: " + withdrawAmount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}