package Horsy.com.company;

import java.util.Scanner;

public class Exercise4_9UnicodeOfACharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");

        String character = input.nextLine();
        char convert = character.charAt(0);
        int number = (int) convert;

        System.out.print("The Unicode for the character " + character + " is "
        + number);

    }
}
