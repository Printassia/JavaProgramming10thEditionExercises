package Horsy.com.company;

import java.util.Scanner;

/*Write a program that prompts the user to enter a hex digit and displays its corresponding binary number.  
*/

public class Exercise4_12 {
    //Hex To Binary 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexDigit = input.next().toUpperCase();
        char character = hexDigit.charAt(0);

        if (character < 'A' || character > 'F')
            System.out.println(hexDigit + " is an invalid input ");
        else {
            //String to hexadecimal
            int hexDecimal = Integer.parseInt(hexDigit, 16);
            //hexadecimal to String
            String binaryValue = Integer.toBinaryString(hexDecimal);
            System.out.println("The hex value of " + hexDigit +
                    " is " + binaryValue);
        }

    }
}
