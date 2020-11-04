package Horsy.com.company.Ch05;

import java.util.Scanner;

/*
(Count vowels and consonants) Assume letters A, E, I, O, and U as the vowels.
Write a program that prompts the user to enter a string and displays the number
of vowels and consonants in the string.
 */

public class Exercise5_49CountVowelsAndConsonants {
    public static void main(String[] args) {

        //Scanner class
        Scanner input = new Scanner(System.in);

        int vowels, consonants;
        vowels = consonants = 0;

        System.out.print("Enter a string: ");
        String word = input.nextLine();

        for (int loop = 0; loop < word.length(); loop++){
            if (Character.isLetter(word.charAt(loop))) {
                if (Character.toUpperCase(word.charAt(loop)) == 'A' ||
                    Character.toUpperCase(word.charAt(loop)) == 'E' ||
                        Character.toUpperCase(word.charAt(loop)) == 'I' ||
                        Character.toUpperCase(word.charAt(loop)) == 'O' ||
                        Character.toUpperCase(word.charAt(loop)) == 'U'){
                    vowels++;
                }
                else consonants++;


            }
        }

        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
    }
}
