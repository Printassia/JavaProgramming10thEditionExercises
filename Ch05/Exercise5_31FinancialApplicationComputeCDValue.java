package Horsy.com.company.Ch05;

import java.util.Scanner;

/*
Write a program that prompts the user to enter an amount (e.g., 10000), the
annual percentage yield (e.g., 5.75), and the number of months (e.g., 18) and
displays a table as shown in the sample run.
 */

public class Exercise5_31FinancialApplicationComputeCDValue {
    public static void main(String[] args) {

        //Create Scanner Class
        Scanner input = new Scanner(System.in);

        //Prompt for the deposit CD . e.g($10,000)
        System.out.print("Enter the initial deposit amount: ");
        double deposit = input.nextDouble();

        //Annual Percent Yield: e.g: 5.75%
        System.out.print("Annual Percentage Yield: ");
        double annualPercentageYield = input.nextDouble();

        //Number of months
        System.out.print("Maturity Period(Number of months): " );
        int months = input.nextInt();

        //Header
        System.out.println("Month\tCD Value");

        //Display Table
        double CD = 0;
        for (int counter = 1; counter <= months; counter++){
            deposit += deposit * (annualPercentageYield / 1200);

            //Display
            System.out.printf("%2d %14.2f \n",counter, deposit);
        }

    }
}
