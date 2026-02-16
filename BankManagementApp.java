import java.util.ArrayList;
import java.util.List;

// Custom Exception Class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}


// Account Class
class Account {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public Account(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully into " + accountNumber);
    }

    // Withdraw Method
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance in account " + accountNumber);
        }

        balance -= amount;
        System.out.println("₹" + amount + " withdrawn successfully from " + accountNumber);
    }

    // Transfer Method
    public void transfer(Account targetAccount, double amount)
            throws InsufficientFundsException {

        if (targetAccount == null) {
            System.out.println("Target account not found.");
            return;
        }

        this.withdraw(amount);
        targetAccount.deposit(amount);

        System.out.println("₹" + amount + " transferred from "
                + this.accountNumber + " to " + targetAccount.accountNumber);
    }

    // Display Account Details
    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : ₹" + balance);
        System.out.println("----------------------------------");
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}


// Bank Class
class Bank {

    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    // Create Account
    public void createAccount(String accountNumber,
                              String accountHolderName,
                              double initialBalance) {

        Account account = new Account(accountNumber, accountHolderName, initialBalance);
        accounts.add(account);
        System.out.println("Account " + accountNumber + " created successfully.");
    }

    // Get Account
    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    // Display All Accounts
    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (Account account : accounts) {
                account.displayAccountDetails();
            }
        }
    }
}


// Main Class
public class BankManagementApp {

    public static void main(String[] args) {

        Bank bank = new Bank();

        // Creating Accounts
        bank.createAccount("A101", "Rahul", 5000);
        bank.createAccount("A102", "Priya", 3000);

        Account acc1 = bank.getAccount("A101");
        Account acc2 = bank.getAccount("A102");

        try {

            // Deposit
            acc1.deposit(2000);

            // Withdraw
            acc1.withdraw(1000);

            // Transfer
            acc1.transfer(acc2, 1500);

            // Attempt invalid withdrawal (Exception example)
            acc2.withdraw(10000);

        } catch (InsufficientFundsException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        // Display all accounts
        System.out.println("\n---- Final Account Details ----");
        bank.displayAllAccounts();
    }
}
