package com.iit.oop;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount Ashen=new BankAccount(0,0001);
        Ashen.deposit(56200);
        System.out.println(Ashen.getBalance());
    }

}
