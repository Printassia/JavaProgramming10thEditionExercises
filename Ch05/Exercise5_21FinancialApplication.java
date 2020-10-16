package Horsy.com.company;

import java.util.Scanner;

/*
(Financial application: compare loans with various interest rates)
Write a program that lets the user enter the loan amount and loan period
in number of years and displays the monthly and total payments
for each interest rate starting from 5% to 8%, with an increment of 1/8.
 */

public class Exercise5_21FinancialApplication {
    public static void main(String[] args) {

        int loanAmount, years;
        double annualInterestRate, monthlyPaymentFormula, totalPayment,
        monthlyPaymentTotal;

        Scanner input = new Scanner(System.in);

        //Principal
        System.out.print("Loan Amount: ");
        loanAmount = input.nextInt();

        //Amount of years
        System.out.print("Number of Years: ");
        years = input.nextInt();

        //Header
        System.out.println("Interest Rate \tMonthly Payment \tTotal Payment");

        //Display interest rates between 5 and 8 incremented by 1/8th
        for (annualInterestRate = 5; annualInterestRate <= 8; annualInterestRate += 0.125){

            //Convert the annual interest rate to a decimal
            double convertInterestRateToDecimal = annualInterestRate / 100;

            //Compute Monthly interest rate
            double monthlyInterestRate = annualInterestRate / 1200;

            //Monthly Payment Formula
            monthlyPaymentFormula = loanAmount * monthlyInterestRate / (1-1
                 / Math.pow(1 + monthlyInterestRate, 12 * years));

           //Total Payment
            totalPayment = monthlyPaymentFormula * years * 12;

            //Output
            System.out.printf("%6.3f%% %18.2f %18.2f \n", annualInterestRate,
                    monthlyPaymentFormula, totalPayment);


        }
    }
}
