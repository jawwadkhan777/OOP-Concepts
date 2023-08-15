package OOP;
class BankAccount {
    private String accountNumber; // Private attribute
    private double balance;       // Private attribute

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345", 1000);

        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Balance: " + account1.getBalance());

        account1.deposit(500);
        System.out.println("Balance after deposit: " + account1.getBalance());

        account1.withdraw(200);
        System.out.println("Balance after withdrawal: " + account1.getBalance());

        account1.withdraw(2000); // This will print "Insufficient balance."

    }
}