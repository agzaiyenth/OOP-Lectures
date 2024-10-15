package com.iit.oop;

public class Account {
    private int accountNum;
    private String accountName;
    private double bankBalance;
    public Account(int accountNum, String accountName){
        this.accountNum = accountNum;
        this.accountName = accountName;
    }
    public void withdraw(double amount){
        bankBalance = bankBalance - amount;
    }
    public void deposit(double amount){
        bankBalance = bankBalance + amount;
    }
    public void close(){
        bankBalance = 0;
    }
}
