package DefiningClasses;

public class BankAccount {

    private int id;
    private double balance;
    private static int accountCount = 1;
    private static double interestRate = 0.02;

    public BankAccount() {
        this.id = accountCount;
        accountCount++;
        this.balance  = 0;

    }
    public static void setInterestRate(double interest) {
        BankAccount.interestRate = interest;

    }
    public double getInterest(int years) {
        return years * this.balance * BankAccount.interestRate;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public int getId() {
        return this.id;
    }
}
