package Horsy.com.company;

import java.text.NumberFormat;
import java.util.Scanner;

/*
(Financial application: payroll) Write a program that reads the following information and prints a payroll statement:
Employee’s name (e.g., Smith)
Number of hours worked in a week (e.g., 10)
Hourly pay rate (e.g., 9.75)
Federal tax withholding rate (e.g., 20%)
State tax withholding rate (e.g., 9%)
 */

public class Exercise4_23FinancialApplicationPayroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee's name: ");
        String employeeName = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        //Calculations
        double grossPay, federalTaxPercentage, stateTaxPercentage, federalTaxWithholding, stateTaxWithholding, totalDeductions, netPay;
        
        //Gross Pay
        grossPay = hoursWorked * hourlyRate;

        //Federal Tax Percentage
        federalTaxPercentage = federalTax * 100;

        //State Tax Percentage
        stateTaxPercentage = stateTax * 100;

        //Federal Withholding Tax
        federalTaxWithholding = grossPay * federalTaxPercentage / 100;

        //State Withholding Tax
        stateTaxWithholding = grossPay * stateTaxPercentage / 100;

        //Total Deductions
        totalDeductions = federalTaxWithholding + stateTaxWithholding;

        //Net Pay
        netPay = grossPay - totalDeductions;

        //Output Statement
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + hourlyRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("\tFederal Withholding "
                + "("+federalTaxPercentage+"%): $" + federalTaxWithholding);
        System.out.println("\tState Withholding "
                + "("+stateTaxPercentage+"%): $" + stateTaxWithholding);
        
        //String Format: Convert total deductions (double) & output
        String convertTotalDeductionsToString = NumberFormat.getCurrencyInstance().format(totalDeductions);
        System.out.println("\tTotal Deductions: " + convertTotalDeductionsToString);

        //String Format: Convert net pay (double) & output
        String convertNetPayToString = NumberFormat.getCurrencyInstance().format(netPay);
        System.out.println("Net Pay: " + convertNetPayToString);



    }
}
