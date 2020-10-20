package Horsy.com.company.Ch05;

import java.util.Scanner;

/*
Write a program that prompts the user to enter a decimal
integer and displays its corresponding binary value. Don’t use Java’s Integer
.toBinaryString(int) in this program.
 */

public class Exercise5_37DecimalToBinary {
    public static void main(String[] args) {
        int number;
        String stringToBinary = "";

        //Create scanner class
        Scanner input = new Scanner(System.in);

        //Input an integer
        System.out.print("Enter the number: ");
        number = input.nextInt();

        //Convert decimal(denary) to binary(bicimal) formula
        while (number > 0) {
            int computeBinary = number % 2;
            stringToBinary += computeBinary;
            number /= 2;
        }
        //Create a string builder
        // Reverse the string to get the correct binary output
        StringBuilder sb = new StringBuilder(stringToBinary);
        //Output
        System.out.println("The binary conversion is " + sb.reverse());
        //close the scanner class
        input.close();
    }
}

