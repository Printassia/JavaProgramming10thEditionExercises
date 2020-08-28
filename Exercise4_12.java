package Horsy.com.company;

import java.util.Scanner;

public class Exercise4_12 {
    //Hex To Binary pg:176
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexDigit = input.next().toUpperCase();
        char character = hexDigit.charAt(0);



        // System.out.println("The binary value is " + binaryValue);

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
