package Horsy.com.company.Ch05;

import java.util.Scanner;

/*
*5.46 (Reverse a string) Write a program that prompts the user to
* enter a string and displays the string in reverse order.
 */

public class Exercise5_46ReverseAString {
    public static void main(String[] args) {
        //Create Scanner class
        Scanner input = new Scanner(System.in);

        //Prompt user to enter a string
        System.out.print("Enter a string: ");
        String word = input.next();

        //Reverse String
        //Create StringBuilder class
        StringBuilder sb = new StringBuilder(word);

        //Display reversed string
        System.out.println("The reversed string is " + sb.reverse());

    }
}
