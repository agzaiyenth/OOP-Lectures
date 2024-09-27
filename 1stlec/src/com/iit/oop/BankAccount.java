package com.iit.oop;

public class BankAccount {
    private double balance;
    private int accountNumber;

    /**
     * Default Constructor
     */
    public BankAccount() {
        super();
    }

    /**
     * Constructor for the Bank Account Class
     * @param balance account balanace
     * @param accountNumber unique identifier for the account
     */
    public BankAccount(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    public void close(){
        balance = 0;
    }
}
