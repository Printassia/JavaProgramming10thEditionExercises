package Horsy.com.company.Ch05;

import java.util.Scanner;

/*
Write a program that prompts the user to enter an amount (e.g., 100), the annual
interest rate (e.g., 5), and the number of months (e.g., 6) and displays the
amount in the savings account after the given month.
 */

public class Exercise5_30FinancialApplicationCompoundValue {
    public static void main(String[] args) {

        //Create scanner class
        Scanner input = new Scanner(System.in);

        double savings = 0;

        //Enter an amount
        System.out.print("Amount: ");
        double amount = input.nextInt();

        //Enter the annual interest rate
        System.out.print("Interest Rate: ");
        double interestRate = input.nextDouble();

        //Monthly Interest Rate Formula
        double monthlyInterestRate = interestRate / 1200;

        //Enter the number of months
        System.out.print("Number of months: ");
        int months = input.nextInt();

        // Display the amount in the savings after the given amount
        for (int counter = 1; counter <= months; counter++){
            savings = (amount + savings) * (1 + monthlyInterestRate);
        }

        //Display
        System.out.printf("Balance after %d months, " +
                "$%.2f \n" , months, savings);
    }
}
