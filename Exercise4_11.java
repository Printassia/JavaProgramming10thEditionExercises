package Horsy.com.company;

import java.util.Scanner;

public class Exercise4_11 {
    //Hex to Binary
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int number = input.nextInt();
        String hex = Integer.toHexString(number);

        if (number > 15) System.out.println(number + " is an invalid input ");
        else System.out.println("The hex value is " + hex.toUpperCase());


    }
}
