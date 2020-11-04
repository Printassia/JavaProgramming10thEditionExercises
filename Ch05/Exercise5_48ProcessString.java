package Horsy.com.company.Ch05;

import java.util.Scanner;

/*
 *5.48 (Process string) Write a program that prompts the user to
 * enter a string and displays the characters at odd positions.
 * pg. 223
 */

public class Exercise5_48ProcessString {
    public static void main(String[] args) {
        //Create scanner class
        Scanner input = new Scanner(System.in);

        //Prompt user to enter a string
        System.out.print("Enter a string: ");
        String word = input.nextLine();

        String oppositePositions = "";

        //Display the characters at odd positions
        for (int loop = 0; loop < word.length(); loop += 2){
            oppositePositions = oppositePositions + word.charAt(loop);
            System.out.print(oppositePositions);
        }

    }
}
