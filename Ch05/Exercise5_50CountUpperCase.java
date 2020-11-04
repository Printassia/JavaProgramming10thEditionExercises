package Horsy.com.company.Ch05;

import java.util.Scanner;

/*
(Count uppercase letters) Write a program that prompts the user to enter a string
and displays the number of the uppercase letters in the string.
 */

public class Exercise5_50CountUpperCase {
    public static void main(String[] args) {
        //Create Scanner class
        Scanner input = new Scanner(System.in);

        int upperCaseCount = 0;

        System.out.print("Enter a string: ");
        String word = input.nextLine();

        for (int loop = 0; loop < word.length(); loop++){
            if (Character.isUpperCase(word.charAt(loop))) {
                upperCaseCount++;
            }
        }

        System.out.println("The number of uppercase letters is: " + upperCaseCount);
    }
}
