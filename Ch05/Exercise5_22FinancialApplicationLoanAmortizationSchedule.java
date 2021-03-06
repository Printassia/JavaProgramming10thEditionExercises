package Horsy.com.company;

import java.util.Scanner;

/*
(Financial application: loan amortization schedule) The monthly payment for a
given loan pays the principal and the interest. The monthly interest is computed
by multiplying the monthly interest rate and the balance (the remaining principal).
The principal paid for the month is therefore the monthly payment minus
the monthly interest. Write a program that lets the user enter the loan amount,
number of years, and interest rate and displays the amortization schedule for the loan.
 */

public class Exercise5_22FinancialApplicationLoanAmortizationSchedule {
    public static void main(String[] args) {

        double monthlyInterestRate, monthlyPaymentFormula,
                totalPayment, annualInterestRate;
        int loanAmount;

        Scanner input = new Scanner(System.in);

        //Loan Amount
        System.out.print("Loan Amount: ");
        loanAmount = input.nextInt();

        //Number of years
        System.out.print("Number of years: ");
        short years = input.nextShort();

        //Annual Interest Rate
        System.out.print("Annual Interest Rate: ");
        annualInterestRate = input.nextInt();

        //Monthly Interest
        monthlyInterestRate = annualInterestRate / 1200;

        //Monthly Payment
        monthlyPaymentFormula = loanAmount * monthlyInterestRate / (1-1
                / Math.pow(1 + monthlyInterestRate, 12 * years));

        //Total Payment
        totalPayment = monthlyPaymentFormula * years * 12;

        //New line
        System.out.println();

        //Output 1
        System.out.printf("Monthly Payment: %.2f \n", monthlyPaymentFormula);
        System.out.printf("Total Payment: %.2f \n", totalPayment);

        //New line
        System.out.println();

        //Header
        System.out.println("Payment#" + "\t\t" + "Interest"
                + "\t\t" + "Principal" + "\t\t" + "Balance");

        // Create amortization schedule
        double balance = loanAmount, principal, interest;

        //Display Monthly payments
        for (int paymentCounter = 1; paymentCounter <= years * 12 ; paymentCounter++){
            interest = monthlyInterestRate * balance;
            principal = monthlyPaymentFormula - interest;
            balance = balance - principal;

            //Output 2
            System.out.printf("%3d %18.2f %16.2f %15.2f \n",
                    paymentCounter, interest, principal, balance);

        }

    }
}
