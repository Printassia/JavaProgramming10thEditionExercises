package Horsy.com.company.Ch09;

import java.util.Date;

/*
 * (The Account class) Design a class named Account that contains:
 *  ■ A private int data field named id for the account (default 0).
 *  ■ A private double data field named balance for the account (default 0).
 *  ■ A private double data field named annualInterestRate that stores the current interest rate (default 0). Assume all accounts have the same interest rate.
 *  ■ A private Date data field named dateCreated that stores the date when the
 * account was created.
 *  ■ A no-arg constructor that creates a default account.
 *  ■ A constructor that creates an account with the specified id and initial balance.
 *  ■ The accessor and mutator methods for id, balance, and annualInterestRate.
 *  ■ The accessor method for dateCreated.
 *  ■ A method named getMonthlyInterestRate() that returns the monthly
 * interest rate.
 *  ■ A method named getMonthlyInterest() that returns the monthly interest.
 *  ■ A method named withdraw that withdraws a specified amount from the
 * account.
 *  ■ A method named deposit that deposits a specified amount to the account.
 * Draw the UML diagram for the class and then implement the class. (Hint: The
 * method getMonthlyInterest() is to return monthly interest, not the interest rate.
 * Monthly interest is balance * monthlyInterestRate. monthlyInterestRate
 * is annualInterestRate / 12. Note that annualInterestRate is a percentage,
 * e.g., like 4.5%. You need to divide it by 100.)
 * Write a test program that creates an Account object with an account ID of 1122,
 * a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
 * method to withdraw $2,500, use the deposit method to deposit $3,000, and print
 * the balance, the monthly interest, and the date when this account was created.
 */

public class Exercise9_7Account {
    public static void main(String[] args) {
        Account account1 = new Account(1122,20_000);

        account1.setAnnualInterestRate(4.5);

        // Use the withdraw method to withdraw $2,500
        account1.withdrawal(2500);

        //use the deposit method to deposit $3,000
        account1.deposit(3000);

        //print the balance, the monthly interest, and the date when this account was created
        System.out.println("--------Account Statement--------");
        System.out.println("ID: " +account1.getId());
        System.out.printf("Balance: $%.2f\n",account1.getBalance());
        System.out.printf("Interest Rate: %.2f%%\n", account1.getAnnualInterestRate());
        System.out.printf("Monthly Interest: $%.2f\n",account1.getMonthlyInterest());
        System.out.println("Date created: " + account1.getDateCreated());
    }
}

class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    /* A no-arg constructor that creates a default account.*/
    public Account() {
    }

    /* A constructor that creates an account with the specified id and initial balance. */
    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    /* The accessor method for id */
    public int getId() {
        return id;
    }

    /* The mutator method for id */
    public void setId(int id) {
        this.id = id;
    }

    /* The accessor method for balance */
    public double getBalance() {
        return balance;
    }

    /* The mutator method for balance */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /* The accessor method for annual interest rate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /* The mutator method for annual interest rate */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /* The accessor method for dateCreated. */
    public Date getDateCreated() {
        return dateCreated;
    }

    /* A method named getMonthlyInterestRate() that returns the monthly interest rate. */
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    /* A method named getMonthlyInterest() that returns the monthly interest. */
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    /* A method named withdraw that withdraws a specified amount from the account. */
    public double withdrawal(double amount) {
        return balance -= amount;
    }

    /* A method named deposit that deposits a specified amount to the account. */
    public double deposit(double amount) {
        return balance += amount;
    }

}

