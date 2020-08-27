package Horsy.com.company;

import java.util.Scanner;
/*
(Find the character of an ASCII code) Write a program that receives an
ASCII code (an integer between 0 and 127) and displays its character.
 */
public class Exercise4_8ASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int ASCII = input.nextInt();
        char convert = (char) ASCII;


        System.out.print("The character for ASCII code " + ASCII + " is " + convert);
    }
}
