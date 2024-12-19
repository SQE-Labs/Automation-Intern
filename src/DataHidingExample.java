class BankAccount {
    private double balance; // Private field (data hiding)

    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal or insufficient balance.");
        }
    }
}

public class DataHidingExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        // Access balance using getter
        System.out.println("Current Balance: " + account.getBalance());

        // Deposit and withdraw money using encapsulated methods
        account.deposit(1500);
        account.withdraw(2000);

        // Uncommenting below line will cause an error (balance is private)
        // account.balance = 10000;
    }
}
