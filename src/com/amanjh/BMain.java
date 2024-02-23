package com.amanjh;

class Account {
    private String accountHolderName;
    private int accountNumber;
    private String accountType;
    private String address;
    private double balance;

    // First constructor
    public Account(String accountHolderName, int accountNumber, String accountType, double initialAmount) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialAmount;
    }

    // Second constructor
    public Account(String accountHolderName, int accountNumber, String address, int accountType, double initialAmount) {
        this(accountHolderName, accountNumber, (accountType == 1) ? "Savings Account" : "Current Account", initialAmount);
        this.address = address;
    }

    // Display account details
    public void displayName() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        if (address != null) {
            System.out.println("Address: " + address);
        }
        System.out.println("Balance: Rs. " + balance);
        System.out.println();
    }

    // Deposit amount
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Rs. " + amount + " deposited successfully.");
        checkBalance();
    }

    // Withdraw amount
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Amount Rs. " + amount + " withdrawn successfully.");
            checkBalance();
        }
    }

    // Display balance
    public void checkBalance() {
        System.out.println("Current Balance: Rs. " + balance);
        System.out.println();
    }
}

public class BMain {
    public static void main(String[] args) {
        // Creating objects of Account class using the first constructor
        Account account1 = new Account("John Doe", 123456, "Savings Account", 5000);
        account1.displayName();
        account1.deposit(2000);
        account1.withdraw(1000);

        // Creating objects of Account class using the second constructor
        Account account2 = new Account("Jane Smith", 789012, "123 Main Street", 2, 10000);
        account2.displayName();
        account2.deposit(3000);
        account2.withdraw(12000);
    }
}

