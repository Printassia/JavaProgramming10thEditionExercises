package Horsy.com.company.Ch05;

import java.util.Scanner;

/*
Write a program that prompts the user to enter a decimal
integer and displays its corresponding octal value. Don’t use Java’s Integer
.toOctalString(int) in this program.
 */

public class Exercise5_38DecimalToOctal {
    public static void main(String[] args) {

        int number;
        String stringToOctal = "";

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Input an integer
        System.out.print("Enter an integer: ");
        number = input.nextInt();

        //Convert decimal to octal formula
        while (number > 0) {
            int decimalToOctal = number % 8;
            stringToOctal += decimalToOctal;
            number /= 8;
        }

        //Create a string builder to reverse the string for the
        //correct output
        StringBuilder sb = new StringBuilder(stringToOctal);
        //Output
        System.out.println("The octal conversion is " + sb.reverse());
        //Close scanner class
        input.close();
    }
}
