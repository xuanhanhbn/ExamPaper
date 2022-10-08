package Exam1;

import java.util.Scanner;

public class Bank {
    Scanner sc = new Scanner(System.in);
    double balance;
    double rate;

    public Bank() {
    }

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public void input(){
        System.out.println("Input Balance: ");
        balance = sc.nextDouble();
        System.out.println("Input AnnualInterestRate: ");
        rate = sc.nextDouble();
    }
    public void output(){
        System.out.println("Balance: " + balance);
        System.out.println("Rate: " + rate);
        System.out.println("Interest : " + calculateInterest());
    }
    public double calculateInterest(){
        return getBalance() * (getRate() / 1200);
    }
}
