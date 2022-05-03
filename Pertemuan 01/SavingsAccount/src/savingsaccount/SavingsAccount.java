package savingsaccount;

public class SavingsAccount {
    public double balance;
    public double interestRate;
    public String name;

    public void displayCustomer() {
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Rate: " + interestRate);
    }
}
