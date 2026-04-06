package p3;

public class Account {
    public String accountHolderName;
    public double balance;

    public void showDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}